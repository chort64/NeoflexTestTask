package com.test.task.neoflextask;

import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.task.neoflextask.model.Employee;
import com.test.task.neoflextask.model.OwnDate;

@SpringBootTest
@AutoConfigureMockMvc
class NeoflexTaskApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test() throws Exception {
		
		OwnDate vacDates[] = { new OwnDate(1, 1), new OwnDate(1, 2)
							 , new OwnDate(1, 3), new OwnDate(2, 1)};

		Employee employee = new Employee(100000, vacDates);

		ObjectMapper mapper = new ObjectMapper();

		mockMvc.perform(get("http://localhost:8080/api/calculacte")
			.contentType("application/json")
			.content(mapper.writeValueAsString(employee)))
			.andDo(print())
			.andExpect(status().isOk());
	}

}
