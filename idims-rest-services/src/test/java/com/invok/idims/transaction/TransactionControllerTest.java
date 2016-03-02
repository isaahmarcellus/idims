package com.invok.idims.transaction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.invok.idims.controller.TransactionController;
import com.invok.idims.dto.TransactionDTO;
import com.invok.idims.service.TransactionService;

/**
 * @author Marcellus
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class TransactionControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Mock
	TransactionDTO transactionDTOMock1;
	
	@Mock
	TransactionDTO transactionDTOMock2;
	
	@Mock
	TransactionDTO transactionDTOMock3;
	
	@InjectMocks
	TransactionService transactionService;

	List<TransactionDTO> transactionList; 

	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),                        
            Charset.forName("utf8")                     
            );
	
	
	@Before
	public void setUp() throws Exception {
		
		// Initialize the mocks
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(new TransactionController()).build();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testEmptyTransactionList() throws Exception {
		
		when(transactionService.listTransactions(1L))
		.thenReturn(new ArrayList<TransactionDTO>());
		
		
		mockMvc.perform(get("/idims/transactions"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(APPLICATION_JSON_UTF8));

	}
	
	@Test
	public final void testAddIncreaseInventoryTransaction() {
	
		
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	public final void testOneItemTransactionList() {
		
		
		List<TransactionDTO> testTxnList = transactionService.listTransactions(0);
		
		// Test that the transaction list is not null and has 1 item
		assertNotNull(transactionList);
		assertEquals(transactionList.size(), 1);
		
	}
	
	@Test
	public final void testAddDecreaseInventoryTransaction() {


		
		fail("Not yet implemented"); // TODO
	}
	
	
	@Test
	public final void testMultipleItemTransactionList() {
	
		// Add 3 transactions
		
		
		// Test that the list is not null and now has 4 transactions
		assertNotNull(transactionList);
		assertEquals(transactionList.size(), 4);
		
	}
	
	
	

}
