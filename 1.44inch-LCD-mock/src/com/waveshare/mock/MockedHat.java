package com.waveshare.mock;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import com.waveshare.display.LcdDisplay;
import com.waveshare.keyboard.HatKey;
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
		BUTTON_UP.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.JOYSTICK_UP, l)));
		BUTTON_DOWN.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.JOYSTICK_DOWN, l)));
		BUTTON_LEFT.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.JOYSTICK_LEFT, l)));
		BUTTON_RIGHT.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.JOYSTICK_RIGHT, l)));
		BUTTON_CENTER.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.JOYSTICK_CENTER, l)));
		BUTTON_A.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.KEY_A, l)));
		BUTTON_B.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.KEY_B, l)));
		BUTTON_C.addActionListener(e -> KEYS.getListener().ifPresent(l -> pressTheButton(HatKey.KEY_C, l)));
	}
		
	private void pressTheButton(HatKey key, KeyInputListener listener) {
		
		listener.keyPressed(key);
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		listener.keyReleased(key);
	}

	public LcdDisplay getDisplay() {
		return DISPLAY;
	}
	
}
