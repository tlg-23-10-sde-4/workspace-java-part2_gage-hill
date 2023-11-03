package com.entertainment.catalog;

import static org.junit.Assert.*;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {

    /*-getInventory---------------------------------------------------------------------------------------------------*/
    @Test(expected = UnsupportedOperationException.class)
    public void getInventory_shouldReturnReadOnlyCollection() {
        Collection<Television> tvs = Catalog.getInventory(); // should be read-only
        tvs.clear(); // should throw exception
    }

    /*-findByBrands---------------------------------------------------------------------------------------------------*/
    @Test
    public void findByBrands_shouldReturnMap_whenBrandPassed() {
        Map<String, Collection<Television>> tvMap = Catalog.findByBrands("Sony", "Zenith");
        assertEquals(2, tvMap.size());

        Collection<Television> sonyTvs = tvMap.get("Sony");
        for (Television tv : sonyTvs) {
            assertEquals("Sony", tv.getBrand());
        }
        Collection<Television> zenithTvs = tvMap.get("Zenith");
        for (Television tv : zenithTvs) {
            assertEquals("Zenith", tv.getBrand());
        }
    }

    @Test
    public void findByBrands_shouldReturnEmptyMap_whenBrandsNotPassed() {
        Map<String, Collection<Television>> tvMap = Catalog.findByBrands();
        assertTrue(tvMap.isEmpty());
    }

    /*-findByBrand----------------------------------------------------------------------------------------------------*/
    @Test
    public void findByBrand_shouldReturnCollection_whenBrandFound() {
        Collection<Television> tvs = Catalog.findByBrand("Sony");
        assertEquals(7, tvs.size());
        for (Television tv : tvs) {
            assertEquals("Sony", tv.getBrand());
        }
    }

    @Test
    public void testFindByBrand_shouldReturnEmptyCollection_whenBrandNotFound() {
        Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
        assertTrue(tvs.isEmpty());
    }
}