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
public class PoseStatef extends Structure {
  /** C type : ovrPosef */
  public Posef Pose;
  /** C type : ovrVector3f */
  public OvrVector3f AngularVelocity;
  /** C type : ovrVector3f */
  public OvrVector3f LinearVelocity;
  /** C type : ovrVector3f */
  public OvrVector3f AngularAcceleration;
  /** C type : ovrVector3f */
  public OvrVector3f LinearAcceleration;
  /** Absolute time of this state sample. */
  public double TimeInSeconds;

  public PoseStatef() {
    super();
  }

  @Override
  protected List<?> getFieldOrder() {
    return Arrays.asList("Pose", "AngularVelocity", "LinearVelocity", "AngularAcceleration", "LinearAcceleration",
        "TimeInSeconds");
  }

  /**
   * @param Pose
   *          C type : ovrPosef<br>
   * @param AngularVelocity
   *          C type : ovrVector3f<br>
   * @param LinearVelocity
   *          C type : ovrVector3f<br>
   * @param AngularAcceleration
   *          C type : ovrVector3f<br>
   * @param LinearAcceleration
   *          C type : ovrVector3f<br>
   * @param TimeInSeconds
   *          Absolute time of this state sample.
   */
  public PoseStatef(Posef Pose, OvrVector3f AngularVelocity, OvrVector3f LinearVelocity,
      OvrVector3f AngularAcceleration, OvrVector3f LinearAcceleration, double TimeInSeconds) {
    super();
    this.Pose = Pose;
    this.AngularVelocity = AngularVelocity;
    this.LinearVelocity = LinearVelocity;
    this.AngularAcceleration = AngularAcceleration;
    this.LinearAcceleration = LinearAcceleration;
    this.TimeInSeconds = TimeInSeconds;
  }

  public PoseStatef(Pointer peer) {
    super(peer);
  }

  public static class ByReference extends PoseStatef implements Structure.ByReference {

  };

  public static class ByValue extends PoseStatef implements Structure.ByValue {

  };
}
