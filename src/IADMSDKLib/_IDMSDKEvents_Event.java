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

public interface _IDMSDKEvents_Event {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnDisconnect(_IDMSDKEvents_OnDisconnectEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDisconnect(_IDMSDKEvents_OnDisconnectEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnReboot(_IDMSDKEvents_OnRebootEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnReboot(_IDMSDKEvents_OnRebootEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnSabreStatusChanged(_IDMSDKEvents_OnSabreStatusChangedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnSabreStatusChanged(_IDMSDKEvents_OnSabreStatusChangedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnUpgradeComplete(_IDMSDKEvents_OnUpgradeCompleteEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnUpgradeComplete(_IDMSDKEvents_OnUpgradeCompleteEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnAlarm(_IDMSDKEvents_OnAlarmEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAlarm(_IDMSDKEvents_OnAlarmEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnLoadBalancingStatus(_IDMSDKEvents_OnLoadBalancingStatusEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnLoadBalancingStatus(_IDMSDKEvents_OnLoadBalancingStatusEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnSabreInfo(_IDMSDKEvents_OnSabreInfoEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnSabreInfo(_IDMSDKEvents_OnSabreInfoEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnIrisControllerStatistics(
      _IDMSDKEvents_OnIrisControllerStatisticsEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnIrisControllerStatistics(
      _IDMSDKEvents_OnIrisControllerStatisticsEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnError(_IDMSDKEvents_OnErrorEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnError(_IDMSDKEvents_OnErrorEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnAcceleratorVersion(_IDMSDKEvents_OnAcceleratorVersionEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAcceleratorVersion(_IDMSDKEvents_OnAcceleratorVersionEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnAcceleratorConnected(_IDMSDKEvents_OnAcceleratorConnectedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAcceleratorConnected(
      _IDMSDKEvents_OnAcceleratorConnectedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnLoadBalancerStatistics(
      _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnLoadBalancerStatistics(
      _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnShutdown(_IDMSDKEvents_OnShutdownEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnShutdown(_IDMSDKEvents_OnShutdownEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnGroupState(_IDMSDKEvents_OnGroupStateEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnGroupState(_IDMSDKEvents_OnGroupStateEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnServerGroupModified(_IDMSDKEvents_OnServerGroupModifiedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnServerGroupModified(_IDMSDKEvents_OnServerGroupModifiedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnSystemState(_IDMSDKEvents_OnSystemStateEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnSystemState(_IDMSDKEvents_OnSystemStateEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnBackPressure(_IDMSDKEvents_OnBackPressureEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnBackPressure(_IDMSDKEvents_OnBackPressureEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnMatchingModeChanged(_IDMSDKEvents_OnMatchingModeChangedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnMatchingModeChanged(_IDMSDKEvents_OnMatchingModeChangedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnMatchPriorityChanged(_IDMSDKEvents_OnMatchPriorityChangedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnMatchPriorityChanged(
      _IDMSDKEvents_OnMatchPriorityChangedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void add_OnMatchCountChanged(_IDMSDKEvents_OnMatchCountChangedEventHandler param0);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void remove_OnMatchCountChanged(_IDMSDKEvents_OnMatchCountChangedEventHandler param0);
}
