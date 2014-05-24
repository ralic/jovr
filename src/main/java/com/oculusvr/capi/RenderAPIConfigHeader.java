package com.oculusvr.capi;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * <i>native declaration : /usr/include/stdint.h</i><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
public class RenderAPIConfigHeader extends Structure {
  /**
   * @see ovrRenderAPIType<br>
   *      C type : ovrRenderAPIType
   */
  public int API;
  /** C type : ovrSizei */
  public OvrSizei RTSize;
  public int Multisample;

  public RenderAPIConfigHeader() {
    super();
  }

  @Override
  protected List<?> getFieldOrder() {
    return Arrays.asList("API", "RTSize", "Multisample");
  }

  /**
   * @param API
   * @see ovrRenderAPIType<br>
   *      C type : ovrRenderAPIType<br>
   * @param RTSize
   *          C type : ovrSizei
   */
  public RenderAPIConfigHeader(int API, OvrSizei RTSize, int Multisample) {
    super();
    this.API = API;
    this.RTSize = RTSize;
    this.Multisample = Multisample;
  }

  public RenderAPIConfigHeader(Pointer peer) {
    super(peer);
  }

  public static class ByReference extends RenderAPIConfigHeader implements Structure.ByReference {

  };

  public static class ByValue extends RenderAPIConfigHeader implements Structure.ByValue {

  };
}
