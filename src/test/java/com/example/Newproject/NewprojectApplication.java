package com.example.Newproject;
import com.example.Newproject.employee.EmployeeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class NewprojectApplication {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception{
        mvc= MockMvcBuilders.standaloneSetup(new EmployeeController()).build();
    }

    @Test
    public void testEmployeeController() throws  Exception{
        RequestBuilder request = null;
        request = get("/test");
        mvc.perform(request).andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"},{\"id\":1,\"name\":\"小红\",\"age\":19,\"gender\":\"女\"},{\"id\":2,\"name\":\"小智\",\"age\":15,\"gender\":\"男\"},{\"id\":3,\"name\":\"小刚\",\"age\":16,\"gender\":\"男\"},{\"id\":4,\"name\":\"小霞\",\"age\":15,\"gender\":\"女\"}]")));
    }
}
