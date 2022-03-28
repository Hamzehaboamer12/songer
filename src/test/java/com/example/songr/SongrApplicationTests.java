package com.example.songr;

import com.example.songr.classes.Albums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {


	Albums test = new Albums();

	/**
	 * Constructor Test on null object
	 */
	@Test
	public void testConstructor(){
		Assertions.assertNull(test.getArtist());
	}

	/**
	 *  Constructor Test on not null object
	 */
	@Test
	public void testConstructorWithValues(){
		//test = new Albums(1 , 56, 12 , "hamzeh" , "hazmeh" , "hamzeh");
		Assertions.assertNotNull(test.getArtist());
	}

	/**
	 * Getters Testing
	 */

	@Test
	public void testGetters(){
        //test = new Albums(1 , 56, 12 , "hamzeh" , "hazmeh" , "hamzeh");
		Assertions.assertEquals("My way",test.getTitle());
		Assertions.assertEquals("frank sinatra",test.getArtist());
		Assertions.assertEquals(10,test.getSongCount());
		Assertions.assertEquals(300,test.getLength());
		Assertions.assertEquals("sdsd",test.getImageUrl());
	}

	/**
	 * Setters Testing
	 */
	@Test
	public void testSetters(){
		test = new Albums();
		test.setTitle("My way");
		test.setArtist("frank sinatra");
		test.setSongCount(5);
		test.setLength(30);
		test.setImageUrl("sdsd");
		Assertions.assertEquals("My way",test.getTitle());
		Assertions.assertEquals("frank sinatra",test.getArtist());
		Assertions.assertEquals(5,test.getSongCount());
		Assertions.assertEquals(30,test.getLength());
		Assertions.assertEquals("sdsd",test.getImageUrl());
	}
}
