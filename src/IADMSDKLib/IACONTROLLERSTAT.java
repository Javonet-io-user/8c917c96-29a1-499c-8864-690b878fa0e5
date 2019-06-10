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

public class IACONTROLLERSTAT extends ValueType {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumActiveSabres() {
    try {
      java.lang.Integer res = javonetHandle.get("NumActiveSabres");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumActiveSabres(java.lang.Integer param) {
    try {
      javonetHandle.set("NumActiveSabres", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumIrisCodes() {
    try {
      java.lang.Integer res = javonetHandle.get("NumIrisCodes");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumIrisCodes(java.lang.Integer param) {
    try {
      javonetHandle.set("NumIrisCodes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getHammingThresholdSingle() {
    try {
      java.lang.Double res = javonetHandle.get("HammingThresholdSingle");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setHammingThresholdSingle(java.lang.Double param) {
    try {
      javonetHandle.set("HammingThresholdSingle", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getHammingThresholdBoth() {
    try {
      java.lang.Double res = javonetHandle.get("HammingThresholdBoth");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setHammingThresholdBoth(java.lang.Double param) {
    try {
      javonetHandle.set("HammingThresholdBoth", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNoOfMatchesAttempted() {
    try {
      java.lang.Integer res = javonetHandle.get("NoOfMatchesAttempted");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNoOfMatchesAttempted(java.lang.Integer param) {
    try {
      javonetHandle.set("NoOfMatchesAttempted", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNoOfMatches() {
    try {
      java.lang.Integer res = javonetHandle.get("NoOfMatches");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNoOfMatches(java.lang.Integer param) {
    try {
      javonetHandle.set("NoOfMatches", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNoOfNonMatches() {
    try {
      java.lang.Integer res = javonetHandle.get("NoOfNonMatches");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setNoOfNonMatches(java.lang.Integer param) {
    try {
      javonetHandle.set("NoOfNonMatches", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getUserCount() {
    try {
      java.lang.Integer res = javonetHandle.get("UserCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserCount(java.lang.Integer param) {
    try {
      javonetHandle.set("UserCount", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getQualityThreshold() {
    try {
      java.lang.Integer res = javonetHandle.get("QualityThreshold");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setQualityThreshold(java.lang.Integer param) {
    try {
      javonetHandle.set("QualityThreshold", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IACONTROLLERSTAT(NObject handle) {
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
