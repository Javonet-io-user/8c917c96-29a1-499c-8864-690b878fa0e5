package IADMSDKLib;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.*;
import IADMSDKLib.*;

public class IALOADBALANCERSTAT extends ValueType {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumActiveControllers() {
    try {
      java.lang.Integer res = javonetHandle.get("NumActiveControllers");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumActiveControllers(java.lang.Integer param) {
    try {
      javonetHandle.set("NumActiveControllers", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumRequests() {
    try {
      java.lang.Integer res = javonetHandle.get("NumRequests");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumRequests(java.lang.Integer param) {
    try {
      javonetHandle.set("NumRequests", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumRequestsProcessed() {
    try {
      java.lang.Integer res = javonetHandle.get("NumRequestsProcessed");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumRequestsProcessed(java.lang.Integer param) {
    try {
      javonetHandle.set("NumRequestsProcessed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getCPULoad() {
    try {
      java.lang.Double res = javonetHandle.get("CPULoad");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCPULoad(java.lang.Double param) {
    try {
      javonetHandle.set("CPULoad", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getMemUsage() {
    try {
      java.lang.Double res = javonetHandle.get("MemUsage");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setMemUsage(java.lang.Double param) {
    try {
      javonetHandle.set("MemUsage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IALOADBALANCERSTAT(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
