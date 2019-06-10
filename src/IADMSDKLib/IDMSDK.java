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

public interface IDMSDK {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Open(
      java.lang.String IPAddress,
      java.lang.String UserID,
      java.lang.String Password,
      AtomicReference<java.lang.Integer> SessionID,
      AtomicReference<java.lang.Byte> UserType,
      Object DateTime,
      AtomicReference<java.lang.Byte> AcceleratorMode,
      AtomicReference<java.lang.Byte> StandAloneMode,
      AtomicReference<java.lang.Byte> ConnectedType,
      AtomicReference<java.lang.Integer> MatchPriority);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Close();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InstallCertificate(java.lang.String ClientCertPath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer DeleteCertificate();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllIrisAccelerators(
      AtomicReference<java.lang.Integer> NumOfServers,
      Object ServerIDs,
      Object ServerIPs,
      Object ServerStatus,
      Object ServerType,
      Object GroupIDs,
      Object GroupNumber);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetControllerConf(IACONTROLLERCONF ServerConfig);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetControllerStat(IACONTROLLERSTAT ServerStat);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSabreConf(IASABRECONF SabreConfig);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSabreStat(IASABRESTAT SabreStat);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetLoadBalancerConf(IALOADBALANCERCONF ServerConfig);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetLoadBalancerStat(IALOADBALANCERSTAT ServerStat);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHamingThreshold(
      AtomicReference<java.lang.Byte> ServerCalculated,
      AtomicReference<java.lang.Double> HammingThreshold,
      AtomicReference<java.lang.Byte> ServerCalculatedBothEye,
      AtomicReference<java.lang.Double> HammingThresholdBothEye);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetHammingThresholdSingleEye(
      java.lang.Byte ServerCalculated, java.lang.Double HammingThreshold);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetHammingThresholdBothEye(
      java.lang.Byte ServerCalculated, java.lang.Double HammingThreshold);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetQualityThreshold(AtomicReference<java.lang.Integer> QualityThreshold);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetQualityThreshold(java.lang.Integer QualityThreshold);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetMatchingMode(java.lang.Integer MatchingMode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetMatchPriority(java.lang.Integer MatchPriority);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetGroupState(
      java.lang.Integer GroupID,
      AtomicReference<java.lang.Integer> NumberOfGroups,
      Object GroupState,
      Object GroupIDs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer AddOperator(java.lang.String UserName, java.lang.String Password);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer RemoveOperator(java.lang.String UserName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllOperators(
      AtomicReference<java.lang.Integer> UserCount, Object UserIDs);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ChangePassword(
      java.lang.String UserID, java.lang.String OldPassword, java.lang.String NewPassword);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetLoggerSettings(
      Object LogTypes, Object LogLevels, AtomicReference<java.lang.Integer> LogCount);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetLoggerSettings(
      Object LogTypes, Object LogLevels, java.lang.Integer LogCount);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetClearLogSettings(
      AtomicReference<java.lang.Integer> ClearType,
      AtomicReference<java.lang.Integer> Value,
      AtomicReference<java.lang.Integer> FilesToRetain);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetClearLogSettings(
      java.lang.Integer ClearType, java.lang.Integer Value, java.lang.Integer FilesToRetain);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ResetStatistics();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Reboot(java.lang.Byte SabreReboot);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Shutdown();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSabreStatus(AtomicReference<java.lang.Integer> SabreStatus);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Upgrade(java.lang.String FileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSdkVersion(Object SDKVersion);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetIrisAcceleratorVersion(AtomicReference<java.lang.Integer> RequestID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer OpenEx(
      java.lang.Integer Port,
      java.lang.String IPAddress,
      java.lang.String UserID,
      java.lang.String Password,
      java.lang.String UserData,
      AtomicReference<java.lang.Integer> SessionID,
      AtomicReference<java.lang.Byte> UserType,
      Object DateTime,
      AtomicReference<java.lang.Byte> AcceleratorMode,
      AtomicReference<java.lang.Byte> StandAloneMode,
      AtomicReference<java.lang.Byte> ConnectedType,
      AtomicReference<java.lang.Integer> MatchPriority);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSystemState(AtomicReference<java.lang.Integer> SystemState);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllPorts(IAPORTCONFIGURATION PortConfig);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetAllPorts(IAPORTCONFIGURATION PortConfig);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetMatchCount(java.lang.Integer MatchCount);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetServerTime(Object DateTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllGroups(
      AtomicReference<java.lang.Integer> NumOfGroups,
      Object GroupNumber,
      Object GroupIDs,
      Object GroupStatus,
      Object GroupDescription);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetConfigData(
      AtomicReference<java.lang.Integer> NumOfConfigData, Object ConfigNames, Object ConfigValues);
}
