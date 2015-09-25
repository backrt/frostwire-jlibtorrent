/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class swig_storage_constructor {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected swig_storage_constructor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(swig_storage_constructor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_swig_storage_constructor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.swig_storage_constructor_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.swig_storage_constructor_change_ownership(this, swigCPtr, true);
  }

  public swig_storage create(storage_params params) {
    long cPtr = (getClass() == swig_storage_constructor.class) ? libtorrent_jni.swig_storage_constructor_create(swigCPtr, this, storage_params.getCPtr(params), params) : libtorrent_jni.swig_storage_constructor_createSwigExplicitswig_storage_constructor(swigCPtr, this, storage_params.getCPtr(params), params);
    return (cPtr == 0) ? null : new swig_storage(cPtr, false);
  }

  public swig_storage_constructor() {
    this(libtorrent_jni.new_swig_storage_constructor(), true);
    libtorrent_jni.swig_storage_constructor_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}