package com.harium.etyl.paparazzi;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PaparazziTest {

    Application application;

    @Before
    public void setUp() {
        application = mock(Application.class);
        when(application.getW()).thenReturn(1);
        when(application.getH()).thenReturn(1);
    }

    @Test
    public void testTakeScreenShot() {
        Paparazzi.takeScreenShot(application);
        verify(application, times(1)).draw((Graphics) any());
    }

    @Test
    public void testTakeScreenShotWithTransparency() {
        Paparazzi.takeScreenShotWithTransparency(application);
        verify(application, times(1)).draw((Graphics) any());
    }
}
