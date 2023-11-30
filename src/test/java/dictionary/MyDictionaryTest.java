package dictionary;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyDictionaryTest {
    @BeforeAll
    static void init(){
        System.out.println("Let's start our checks...");
    }
    @AfterAll
    static void finish(){
        System.out.println("Our checks are done");
    }
    @Mock
    Map<String, String> wordMap;
    @InjectMocks
    MyDictionary dic = new MyDictionary();
    @DisplayName("getMeaning function test")
    @Test
    void testGetMeaning(){
        Mockito.when(wordMap.get("patata")).thenReturn("tuberculo");

        assertEquals("tuberculo", dic.getMeaning("patata"));
    }
}
