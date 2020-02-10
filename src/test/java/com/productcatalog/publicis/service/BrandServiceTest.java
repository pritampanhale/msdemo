package com.productcatalog.publicis.service;

import com.productcatalog.publicis.entitiy.Brand;
import com.productcatalog.publicis.repository.BrandRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

public class BrandServiceTest {

    @Mock
    private BrandRepository brandRepository;

    @InjectMocks
    private BrandService brandService;

    @BeforeEach
    public void beforeEachTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBrandService() {
        Brand brand = new Brand();
        brand.setName("TestBrand");

        /*Mockito.doNothing().when(brandRepository).saveAll(Mockito.any());
        Mockito.doNothing().when(brandRepository).save(Mockito.any());*/
        Mockito.when(brandRepository.saveAll(Mockito.any())).thenReturn(Collections.singletonList(brand));
        Mockito.when(brandRepository.save(Mockito.any())).thenReturn(brand);
        Mockito.when(brandRepository.findById(Mockito.any())).thenReturn(Optional.of(brand));
        Mockito.when(brandRepository.findAll()).thenReturn(Collections.singletonList(brand));



        brandService.createBrand(brand);
        Mockito.verify(brandRepository, Mockito.times(1)).save(Mockito.any());

        brandService.createBrands(Collections.singletonList(brand));
        Mockito.verify(brandRepository, Mockito.times(1)).saveAll(Mockito.any());

        brandService.updateBrand(brand);
        Mockito.verify(brandRepository, Mockito.times(2)).save(Mockito.any());

        brandService.getAllBrands();
        Mockito.verify(brandRepository, Mockito.times(1)).findAll();

        brandService.getBrand(Mockito.any());
        Mockito.verify(brandRepository, Mockito.times(1)).findById(Mockito.any());

    }

}
