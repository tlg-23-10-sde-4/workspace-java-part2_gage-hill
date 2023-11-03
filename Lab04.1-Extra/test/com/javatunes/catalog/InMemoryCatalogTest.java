package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    // for each business method in 'InMemoryCatalog' write one or more @Test methods
    // methodcall_should/notreturnwhat_whenwhat (naming format for @Test methods
    // THINK: I assert that this (item) is null and if it's true it passes



    /*-numberInGenre--------------------------------------------------------------------------------------------------*/
    @Test
    public void numberInGenre_shouldReturnCorrectResult() {
        int result = catalog.numberInGenre(MusicCategory.POP);
        assertEquals(4, result);
    }

    /*-findSelfTitled-------------------------------------------------------------------------------------------------*/
    @Test
    public void findSelfTitles_shouldReturnCollection_withArtistSameAsTitle() {
        Collection<MusicItem> items = catalog.findSelfTitled();
        assertEquals(2, items.size());
        for (MusicItem item : items) {
            assertTrue(item.getArtist().equals(item.getTitle()));
            assertEquals(item.getArtist(), item.getTitle());
        }
    }

    /*findByCategory--------------------------------------------------------------------------------------------------*/
    @Test
    public void findByCategory_shouldReturnCollection_whenCategoryFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        assertEquals(4, items.size());
        for (MusicItem item : items) {
            assertEquals(MusicCategory.POP, item.getMusicCategory());
        }
    }

    @Test
    public void findByCategory_shouldReturnEmptyCollection_whenCategoryNotFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.JAZZ);
        assertEquals(0, items.size());
    }

    /*-findById-------------------------------------------------------------------------------------------------------*/
    @Test
    public void findById_shouldReturnMusicItem_whenIdFound() {
        MusicItem item = catalog.findById(1L);
        assertEquals(1L, item.getId().longValue()); // this is down-casting to a (long) - to extract the getter use .longValue()
    }

    @Test
    public void findById_shouldReturnNull_whenIdNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
    }
}