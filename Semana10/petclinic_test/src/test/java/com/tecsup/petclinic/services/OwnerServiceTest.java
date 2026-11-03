package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class OwnerServiceTest {

    @Autowired
    private OwnerService ownerService;

    @Test
    public void testFindOwnerById() {
        long ID = 1;
        String EXPECTED_FIRST_NAME = "George";
        Owner owner = null;

        try {
            owner = this.ownerService.findById(ID);
            assertEquals(EXPECTED_FIRST_NAME, owner.getFirstName());
            log.info("Owner encontrado: " + owner);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCreateOwner() {
        Owner owner = new Owner();
        owner.setFirstName("Ana");
        owner.setLastName("Perez");
        owner.setAddress("Av. Los Frutales");
        owner.setCity("Lima");
        owner.setTelephone("123456789");

        Owner createdOwner = this.ownerService.create(owner);

        log.info("Owner creado: " + createdOwner);
        assertNotNull(createdOwner.getId());
        assertEquals("Ana", createdOwner.getFirstName());
    }

    @Test
    public void testUpdateOwner() {
        // 1. Crear
        Owner owner = new Owner();
        owner.setFirstName("Carlos");
        owner.setLastName("Lopez");
        owner.setAddress("Calle 1");
        owner.setCity("Lima");
        owner.setTelephone("987654321");

        Owner createdOwner = this.ownerService.create(owner);

        // 2. Actualizar
        String UP_FIRST_NAME = "Carlos Editado";
        createdOwner.setFirstName(UP_FIRST_NAME);
        Owner updatedOwner = this.ownerService.update(createdOwner);

        log.info("Owner actualizado: " + updatedOwner);
        assertEquals(UP_FIRST_NAME, updatedOwner.getFirstName());
    }

    @Test
    public void testDeleteOwner() {
        // 1. Crear
        Owner owner = new Owner();
        owner.setFirstName("Luis");
        owner.setLastName("Gomez");
        owner.setAddress("Av 2");
        owner.setCity("Lima");
        owner.setTelephone("999888777");

        Owner createdOwner = this.ownerService.create(owner);

        // 2. Eliminar
        try {
            this.ownerService.delete(createdOwner.getId());
            log.info("Owner eliminado correctamente.");
        } catch (Exception e) {
            fail(e.getMessage());
        }

        // 3. Validar que ya no existe (debe lanzar error al buscarlo)
        try {
            this.ownerService.findById(createdOwner.getId());
            fail("El owner no debería existir");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}