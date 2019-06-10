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
import IADMSDKLib.*;
import jio.System.*;

public class _IDMSDKEvents_SinkHelper implements _IDMSDKEvents {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnDisconnectEventHandler getm_OnDisconnectDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnDisconnectDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnDisconnectDelegate(_IDMSDKEvents_OnDisconnectEventHandler param) {
    try {
      javonetHandle.set("m_OnDisconnectDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnRebootEventHandler getm_OnRebootDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnRebootDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnRebootDelegate(_IDMSDKEvents_OnRebootEventHandler param) {
    try {
      javonetHandle.set("m_OnRebootDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnSabreStatusChangedEventHandler getm_OnSabreStatusChangedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnSabreStatusChangedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnSabreStatusChangedDelegate(
      _IDMSDKEvents_OnSabreStatusChangedEventHandler param) {
    try {
      javonetHandle.set("m_OnSabreStatusChangedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnUpgradeCompleteEventHandler getm_OnUpgradeCompleteDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnUpgradeCompleteDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnUpgradeCompleteDelegate(_IDMSDKEvents_OnUpgradeCompleteEventHandler param) {
    try {
      javonetHandle.set("m_OnUpgradeCompleteDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnAlarmEventHandler getm_OnAlarmDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnAlarmDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnAlarmDelegate(_IDMSDKEvents_OnAlarmEventHandler param) {
    try {
      javonetHandle.set("m_OnAlarmDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnLoadBalancingStatusEventHandler getm_OnLoadBalancingStatusDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnLoadBalancingStatusDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnLoadBalancingStatusDelegate(
      _IDMSDKEvents_OnLoadBalancingStatusEventHandler param) {
    try {
      javonetHandle.set("m_OnLoadBalancingStatusDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnSabreInfoEventHandler getm_OnSabreInfoDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnSabreInfoDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnSabreInfoDelegate(_IDMSDKEvents_OnSabreInfoEventHandler param) {
    try {
      javonetHandle.set("m_OnSabreInfoDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnIrisControllerStatisticsEventHandler
      getm_OnIrisControllerStatisticsDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnIrisControllerStatisticsDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnIrisControllerStatisticsDelegate(
      _IDMSDKEvents_OnIrisControllerStatisticsEventHandler param) {
    try {
      javonetHandle.set("m_OnIrisControllerStatisticsDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnErrorEventHandler getm_OnErrorDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnErrorDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnErrorDelegate(_IDMSDKEvents_OnErrorEventHandler param) {
    try {
      javonetHandle.set("m_OnErrorDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnAcceleratorVersionEventHandler getm_OnAcceleratorVersionDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnAcceleratorVersionDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnAcceleratorVersionDelegate(
      _IDMSDKEvents_OnAcceleratorVersionEventHandler param) {
    try {
      javonetHandle.set("m_OnAcceleratorVersionDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnAcceleratorConnectedEventHandler getm_OnAcceleratorConnectedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnAcceleratorConnectedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnAcceleratorConnectedDelegate(
      _IDMSDKEvents_OnAcceleratorConnectedEventHandler param) {
    try {
      javonetHandle.set("m_OnAcceleratorConnectedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler
      getm_OnLoadBalancerStatisticsDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnLoadBalancerStatisticsDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnLoadBalancerStatisticsDelegate(
      _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler param) {
    try {
      javonetHandle.set("m_OnLoadBalancerStatisticsDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnShutdownEventHandler getm_OnShutdownDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnShutdownDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnShutdownDelegate(_IDMSDKEvents_OnShutdownEventHandler param) {
    try {
      javonetHandle.set("m_OnShutdownDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnGroupStateEventHandler getm_OnGroupStateDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnGroupStateDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnGroupStateDelegate(_IDMSDKEvents_OnGroupStateEventHandler param) {
    try {
      javonetHandle.set("m_OnGroupStateDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnServerGroupModifiedEventHandler getm_OnServerGroupModifiedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnServerGroupModifiedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnServerGroupModifiedDelegate(
      _IDMSDKEvents_OnServerGroupModifiedEventHandler param) {
    try {
      javonetHandle.set("m_OnServerGroupModifiedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnSystemStateEventHandler getm_OnSystemStateDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnSystemStateDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnSystemStateDelegate(_IDMSDKEvents_OnSystemStateEventHandler param) {
    try {
      javonetHandle.set("m_OnSystemStateDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnBackPressureEventHandler getm_OnBackPressureDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnBackPressureDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnBackPressureDelegate(_IDMSDKEvents_OnBackPressureEventHandler param) {
    try {
      javonetHandle.set("m_OnBackPressureDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnMatchingModeChangedEventHandler getm_OnMatchingModeChangedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnMatchingModeChangedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnMatchingModeChangedDelegate(
      _IDMSDKEvents_OnMatchingModeChangedEventHandler param) {
    try {
      javonetHandle.set("m_OnMatchingModeChangedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnMatchPriorityChangedEventHandler getm_OnMatchPriorityChangedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnMatchPriorityChangedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnMatchPriorityChangedDelegate(
      _IDMSDKEvents_OnMatchPriorityChangedEventHandler param) {
    try {
      javonetHandle.set("m_OnMatchPriorityChangedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public _IDMSDKEvents_OnMatchCountChangedEventHandler getm_OnMatchCountChangedDelegate() {
    try {
      Object res = javonetHandle.<NObject>get("m_OnMatchCountChangedDelegate");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_OnMatchCountChangedDelegate(
      _IDMSDKEvents_OnMatchCountChangedEventHandler param) {
    try {
      javonetHandle.set("m_OnMatchCountChangedDelegate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getm_dwCookie() {
    try {
      java.lang.Integer res = javonetHandle.get("m_dwCookie");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setm_dwCookie(java.lang.Integer param) {
    try {
      javonetHandle.set("m_dwCookie", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public _IDMSDKEvents_SinkHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDisconnect(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("IADMSDKLib._IDMSDKEvents").invoke("OnDisconnect", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnReboot(java.lang.Integer param0, java.lang.Byte param1) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnReboot", param0, param1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnSabreStatusChanged(
      java.lang.Integer param0, java.lang.Byte param1, java.lang.String param2) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnSabreStatusChanged", param0, param1, param2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnUpgradeComplete(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnUpgradeComplete", param0, param1, param2, param3);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnAlarm(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.String param2,
      java.lang.Integer param3,
      java.lang.String param4) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnAlarm", param0, param1, param2, param3, param4);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnLoadBalancingStatus(
      java.lang.Integer param0,
      java.lang.String param1,
      java.lang.Integer param2,
      java.lang.Integer param3) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnLoadBalancingStatus", param0, param1, param2, param3);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnSabreInfo(
      java.lang.Integer param0, java.lang.Double param1, java.lang.Double param2) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnSabreInfo", param0, param1, param2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnIrisControllerStatistics(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Byte param3,
      java.lang.Double param4,
      java.lang.Byte param5,
      java.lang.Double param6,
      java.lang.Integer param7,
      java.lang.Integer param8,
      java.lang.Integer param9,
      java.lang.Integer param10,
      Object param11) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke(
              "OnIrisControllerStatistics",
              param0,
              param1,
              param2,
              param3,
              param4,
              param5,
              param6,
              param7,
              param8,
              param9,
              param10,
              param11);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnError(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.String param2,
      java.lang.Integer param3,
      java.lang.Integer param4,
      java.lang.String param5) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnError", param0, param1, param2, param3, param4, param5);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnAcceleratorVersion(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.String param2,
      java.lang.Integer param3) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnAcceleratorVersion", param0, param1, param2, param3);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnAcceleratorConnected(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.String param2,
      java.lang.Byte param3,
      java.lang.Byte param4,
      java.lang.Integer param5,
      java.lang.Integer param6) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnAcceleratorConnected", param0, param1, param2, param3, param4, param5, param6);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnLoadBalancerStatistics(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3,
      java.lang.Integer param4,
      java.lang.Double param5,
      java.lang.Double param6) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke(
              "OnLoadBalancerStatistics", param0, param1, param2, param3, param4, param5, param6);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnShutdown(java.lang.Integer param0) {
    try {
      javonetHandle.explicitInterface("IADMSDKLib._IDMSDKEvents").invoke("OnShutdown", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnGroupState(
      java.lang.Integer param0, java.lang.Integer param1, java.lang.Integer param2) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnGroupState", param0, param1, param2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnServerGroupModified(
      java.lang.Integer param0,
      java.lang.Integer param1,
      java.lang.Integer param2,
      java.lang.Integer param3) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnServerGroupModified", param0, param1, param2, param3);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnSystemState(java.lang.Integer param0, java.lang.Byte param1) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnSystemState", param0, param1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBackPressure(
      java.lang.Integer param0, java.lang.Byte param1, java.lang.String param2) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnBackPressure", param0, param1, param2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnMatchingModeChanged(java.lang.Integer param0, java.lang.Integer param1) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnMatchingModeChanged", param0, param1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnMatchPriorityChanged(java.lang.Integer param0, java.lang.Integer param1) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnMatchPriorityChanged", param0, param1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnMatchCountChanged(java.lang.Integer param0, java.lang.Integer param1) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents")
          .invoke("OnMatchCountChanged", param0, param1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
