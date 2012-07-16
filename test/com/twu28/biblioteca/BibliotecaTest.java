package com.twu28.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BibliotecaTest {
    @Test(timeout = 1000)
    public void shouldWelcomeCustomer() {
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);
        when(mockInput.read()).thenReturn(0);

        new Biblioteca(mockOutput, mockInput).start();

        verify(mockOutput).print("Welcome User.");
    }

    @Test(timeout = 1000)
    public void shouldSayMenuOptions() {
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);
        when(mockInput.read()).thenReturn(0);

        new Biblioteca(mockOutput, mockInput).start();

        verify(mockOutput).print("0. Exit");
    }

    @Test(timeout = 1000)
    public void shouldExitApplicationOnSelecting0() {
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);

        when(mockInput.read()).thenReturn(0);

        new Biblioteca(mockOutput, mockInput).start();

        verify(mockOutput).print("Bye!");
    }

    @Test(timeout = 1000)
    public void shouldAskToSelectValidOption() {
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);

        when(mockInput.read()).thenReturn(100, 0);

        new Biblioteca(mockOutput, mockInput).start();

        verify(mockOutput).print("Select a valid option");
    }

}
