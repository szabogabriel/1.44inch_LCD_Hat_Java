package com.waveshare.mock;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.waveshare.display.LcdDisplay;
import com.waveshare.keyboard.KeyState;
import com.waveshare.keyboard.Keys;
import com.waveshare.keyboard.emulated.EmulatedKeys;
import com.waveshare.keyboard.listener.KeyInputListener;

public class MockedHat extends JFrame {
	
	private static final long serialVersionUID = -728375307128141501L;
	
	private final JPanel panelLeft = new JPanel();
	private final JPanel panelRight = new JPanel();
	
	private final JButton BUTTON_UP = new JButton("^");
	private final JButton BUTTON_DOWN = new JButton("v");
	private final JButton BUTTON_LEFT = new JButton("<");
	private final JButton BUTTON_RIGHT = new JButton(">");
	private final JButton BUTTON_CENTER = new JButton("O");
	
	private final JButton BUTTON_A = new JButton("A");
	private final JButton BUTTON_B = new JButton("B");
	private final JButton BUTTON_C = new JButton("C");
	
	private final DisplayComponent DISPLAY;
	
	private final EmulatedKeys KEYS;
	
	public MockedHat(EmulatedKeys keys) throws IOException {	
		super("LCD HAT mock");
		
		KEYS = keys;
		
		setupButtons();
		
		DISPLAY = new DisplayComponent();
		setLayout(new BorderLayout());

		DISPLAY.setPreferredSize(new Dimension(128, 128));
		add(DISPLAY, BorderLayout.CENTER);
		
		panelLeft.setLayout(new BorderLayout());
		panelLeft.add(BUTTON_UP, BorderLayout.NORTH);
		panelLeft.add(BUTTON_DOWN, BorderLayout.SOUTH);
		panelLeft.add(BUTTON_RIGHT, BorderLayout.EAST);
		panelLeft.add(BUTTON_LEFT, BorderLayout.WEST);
		panelLeft.add(BUTTON_CENTER, BorderLayout.CENTER);
		add(panelLeft, BorderLayout.WEST);
		
		panelRight.setLayout(new BorderLayout());
		panelRight.add(BUTTON_A, BorderLayout.NORTH);
		panelRight.add(BUTTON_B, BorderLayout.CENTER);
		panelRight.add(BUTTON_C, BorderLayout.SOUTH);
		add(panelRight, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SwingUtilities.invokeLater(() -> {
			pack();
			setVisible(true);
		});
	}
	
	private void setupButtons() {
		BUTTON_UP.addActionListener(e -> KEYS.getListener(Keys.JOYSTICK_UP).ifPresent(this::pressTheButton));
		BUTTON_DOWN.addActionListener(e -> KEYS.getListener(Keys.JOYSTICK_DOWN).ifPresent(this::pressTheButton));
		BUTTON_LEFT.addActionListener(e -> KEYS.getListener(Keys.JOYSTICK_LEFT).ifPresent(this::pressTheButton));
		BUTTON_RIGHT.addActionListener(e -> KEYS.getListener(Keys.JOYSTICK_RIGHT).ifPresent(this::pressTheButton));
		BUTTON_CENTER.addActionListener(e -> KEYS.getListener(Keys.JOYSTICK_CENTER).ifPresent(this::pressTheButton));
		BUTTON_A.addActionListener(e -> KEYS.getListener(Keys.KEY_A).ifPresent(this::pressTheButton));
		BUTTON_B.addActionListener(e -> KEYS.getListener(Keys.KEY_B).ifPresent(this::pressTheButton));
		BUTTON_C.addActionListener(e -> KEYS.getListener(Keys.KEY_C).ifPresent(this::pressTheButton));
	}
		
	private void pressTheButton(KeyInputListener listener) {
		listener.keyStateChanged(KeyState.PRESSED);
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		listener.keyStateChanged(KeyState.RELEASED);
	}

	public LcdDisplay getDisplay() {
		return DISPLAY;
	}

}
