package com.oculusvr.capi;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OvrVector2i extends Structure {
	public int x;
	public int y;
	public OvrVector2i() {
		super();
	}
	@Override
  protected List<? > getFieldOrder() {
		return Arrays.asList("x", "y");
	}
	public OvrVector2i(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public OvrVector2i(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OvrVector2i implements Structure.ByReference {
		
	};
	public static class ByValue extends OvrVector2i implements Structure.ByValue {
	    public ByValue() { }
	       public ByValue(OvrVector2i o) {
	           super(o.x, o.y);
	         }

	};
}
