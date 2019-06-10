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

public interface _IDMSDKEvents {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnDisconnect(java.lang.Integer SessionID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnReboot(java.lang.Integer SessionID, java.lang.Byte SabreReboot);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnSabreStatusChanged(
      java.lang.Integer SessionID, java.lang.Byte SabreStatus, java.lang.String DateTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnUpgradeComplete(
      java.lang.Integer SessionID,
      java.lang.Integer UpgradeStatus,
      java.lang.Integer ControllerStatus,
      java.lang.Integer SabreStatus);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnAlarm(
      java.lang.Integer SessionID,
      java.lang.Integer SourceType,
      java.lang.String DateTime,
      java.lang.Integer Code,
      java.lang.String Description);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnLoadBalancingStatus(
      java.lang.Integer SessionID,
      java.lang.String DateTime,
      java.lang.Integer TotalIrisCode,
      java.lang.Integer CompletedIrisCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnSabreInfo(
      java.lang.Integer SessionID, java.lang.Double CPULoad, java.lang.Double MemInfo);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnIrisControllerStatistics(
      java.lang.Integer SessionID,
      java.lang.Integer IrisCodeCount,
      java.lang.Integer UserCount,
      java.lang.Byte ServerCalculated,
      java.lang.Double HammingThreshold,
      java.lang.Byte ServerCalculatedBoth,
      java.lang.Double HammingThresholdBoth,
      java.lang.Integer NoOfMatchesAttempted,
      java.lang.Integer NoOfMatches,
      java.lang.Integer NoOfNonMatches,
      java.lang.Integer QualityThreshold,
      Object SabreStat);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnError(
      java.lang.Integer SessionID,
      java.lang.Integer SourceType,
      java.lang.String DateTime,
      java.lang.Integer Command,
      java.lang.Integer ErrorCode,
      java.lang.String Description);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnAcceleratorVersion(
      java.lang.Integer SessionID,
      java.lang.Integer RequestID,
      java.lang.String ProductVersion,
      java.lang.Integer Response);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnAcceleratorConnected(
      java.lang.Integer SessionID,
      java.lang.Integer AcceleratorID,
      java.lang.String IPAddress,
      java.lang.Byte Status,
      java.lang.Byte ConnectionType,
      java.lang.Integer GroupID,
      java.lang.Integer GroupNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnLoadBalancerStatistics(
      java.lang.Integer SessionID,
      java.lang.Integer State,
      java.lang.Integer NumActiveControllers,
      java.lang.Integer NumRequests,
      java.lang.Integer NumRequestsProcessed,
      java.lang.Double CPULoad,
      java.lang.Double MemUsage);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnShutdown(java.lang.Integer SessionID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnGroupState(
      java.lang.Integer SessionID, java.lang.Integer GroupID, java.lang.Integer State);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnServerGroupModified(
      java.lang.Integer SessionID,
      java.lang.Integer GroupID,
      java.lang.Integer GroupNumber,
      java.lang.Integer AcceleratorID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnSystemState(java.lang.Integer SessionID, java.lang.Byte State);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnBackPressure(
      java.lang.Integer SessionID, java.lang.Byte Status, java.lang.String DateTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnMatchingModeChanged(java.lang.Integer SessionID, java.lang.Integer MatchingMode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnMatchPriorityChanged(java.lang.Integer SessionID, java.lang.Integer MatchPriority);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void OnMatchCountChanged(java.lang.Integer SessionID, java.lang.Integer MatchCount);
}
