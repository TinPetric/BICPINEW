package ro.ovidiuconeac.client.features.food.presentation.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ro.ovidiuconeac.client.features.food.exceptions.NoResultException;
import ro.ovidiuconeac.client.features.food.exceptions.RequestException;
import ro.ovidiuconeac.client.features.food.rest.RestServiceApi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by ovidiu on 2/7/17.
 */

public class FoodUseCasesWithRequestExceptionTest {

    private FoodUseCases foodUseCases;

    @Before
    public void setUp() {
        foodUseCases = Mockito.mock(FoodUseCases.class);
    }

    @After
    public void tearDown() {
        foodUseCases = null;
    }

    @Test
    public void testGetFruit1WithRequestException() {
        try {
            when(foodUseCases.getFruit1(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getFruit1(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetFruit2WithRequestException() {
        try {
            when(foodUseCases.getFruit2(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getFruit2(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetCheese1WithRequestException() {
        try {
            when(foodUseCases.getCheese1(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getCheese1(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetCheese2WithRequestException() {
        try {
            when(foodUseCases.getCheese2(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getCheese2(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetSweet1WithRequestException() {
        try {
            when(foodUseCases.getSweet1(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getSweet1(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }

    @Test
    public void testGetSweet2WithRequestException() {
        try {
            when(foodUseCases.getSweet2(any(RestServiceApi.class)))
                    .thenThrow(new RequestException());
            foodUseCases.getSweet2(any(RestServiceApi.class));
        } catch (RequestException | NoResultException e) {
            assertEquals("Request exception. Unable to contact server.", e.getMessage());
        }
    }
}