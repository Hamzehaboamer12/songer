package com.example.songr;

import com.example.songr.classes.Albums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void ablumsTest(){
		Albums newAlbum = new Albums( 24, 24, "Sad Life" ,"image URL", "hamzeh");

		Assertions.assertEquals("Sad Life",newAlbum.getTitle());
		Assertions.assertEquals("hamzeh",newAlbum.getArtist());
		Assertions.assertEquals(24,newAlbum.getLength());
		Assertions.assertEquals(8,newAlbum.getSongCount());
		Assertions.assertEquals("image URL",newAlbum.getImageUrl());


	}
}
