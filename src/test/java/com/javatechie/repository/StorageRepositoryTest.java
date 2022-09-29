package com.javatechie.repository;

import com.javatechie.entity.ImageData;
import com.javatechie.service.StorageService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class StorageRepositoryTest {

    @Mock
    StorageRepository storageRepository;


    @Test
    void findByName() {
        ImageData imageData = new ImageData(1000L, "name", "jpg", "C:\\Users\\Atul\\PanCard.jpg".getBytes());
        storageRepository.save(imageData);

        Optional<ImageData> actualResult = storageRepository.findByName("name");
        System.out.println(" This is test method-1");
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void fileIsNull() {
        ImageData imageData = new ImageData(1000L, "name", "jpg", null);
        storageRepository.save(imageData);

        Optional<ImageData> actualResult = storageRepository.findByName("name");
        System.out.println(" This is test method-2");
        assertThat(actualResult).isEmpty();


    }

    @BeforeEach
    void setUp() {
        System.out.println("This is Before Each method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("This is After Each method");
    }
}