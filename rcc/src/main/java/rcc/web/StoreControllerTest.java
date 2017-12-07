package rcc.web;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import rcc.models.Store;
import rcc.services.StoreServiceImpl;

public class StoreControllerTest {

	@Test
	public void ShouldShowStores() throws Exception {
		List<Store> expectedResult = createStoreList(30);
		StoreServiceImpl mockRepository = 
				mock(StoreServiceImpl.class);
		
		when(mockRepository.GetAllStores(30)).thenReturn(expectedResult);
		
		StoreController controller =
				new StoreController(mockRepository);
		
	
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/views/stores.jsp"))
				.build();
		
		mockMvc.perform(get("/stores"))
				.andExpect(view().name("stores"))
				.andExpect(model().attributeExists("storesList"))
				.andExpect(model().attribute("storesList",
						hasItems(expectedResult.toArray())));		
	}
	
	@Test
	public void ShouldShowStoresPerPage() throws Exception {
		List<Store> expectedResult = createStoreList(30);
		StoreServiceImpl mockRepository = 
				mock(StoreServiceImpl.class);
		
		when(mockRepository.GetAllStores(10)).thenReturn(expectedResult);
		
		StoreController controller =
				new StoreController(mockRepository);
		
	
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/views/stores.jsp"))
				.build();
		
		mockMvc.perform(get("/stores"))
				.andExpect(view().name("stores"))
				.andExpect(model().attributeExists("storesList"))
				.andExpect(model().attribute("storesList",
						hasItems(expectedResult.toArray())));		
	}

	public List<Store> createStoreList(int numberOfStores) {

		List<Store> storeList = new ArrayList<Store>();
		for (int i = 2001, j = 0; i < (2001 + numberOfStores); i++, j++) {
			storeList.add(new Store(j, i, "66.30.1." + (j + 10)));
		}
		
		return storeList;
	}
}
