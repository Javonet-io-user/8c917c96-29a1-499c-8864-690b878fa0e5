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

public class DMSDKClass extends __ComObject implements IDMSDK, DMSDK, _IDMSDKEvents_Event {
  protected NObject javonetHandle;

  public DMSDKClass() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("IADMSDKLib.DMSDKClass");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnDisconnect",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnDisconnectEventHandler handler : _OnDisconnectListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnReboot",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnRebootEventHandler handler : _OnRebootListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Byte.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnSabreStatusChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnSabreStatusChangedEventHandler handler :
                  _OnSabreStatusChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Byte.class),
                    Convert(objects[2], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnUpgradeComplete",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnUpgradeCompleteEventHandler handler :
                  _OnUpgradeCompleteListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnAlarm",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnAlarmEventHandler handler : _OnAlarmListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.String.class),
                    Convert(objects[3], java.lang.Integer.class),
                    Convert(objects[4], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnLoadBalancingStatus",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnLoadBalancingStatusEventHandler handler :
                  _OnLoadBalancingStatusListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.String.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnSabreInfo",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnSabreInfoEventHandler handler : _OnSabreInfoListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Double.class),
                    Convert(objects[2], java.lang.Double.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnIrisControllerStatistics",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnIrisControllerStatisticsEventHandler handler :
                  _OnIrisControllerStatisticsListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Byte.class),
                    Convert(objects[4], java.lang.Double.class),
                    Convert(objects[5], java.lang.Byte.class),
                    Convert(objects[6], java.lang.Double.class),
                    Convert(objects[7], java.lang.Integer.class),
                    Convert(objects[8], java.lang.Integer.class),
                    Convert(objects[9], java.lang.Integer.class),
                    Convert(objects[10], java.lang.Integer.class),
                    Convert(objects[11], Object.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnErrorEventHandler handler : _OnErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.String.class),
                    Convert(objects[3], java.lang.Integer.class),
                    Convert(objects[4], java.lang.Integer.class),
                    Convert(objects[5], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnAcceleratorVersion",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnAcceleratorVersionEventHandler handler :
                  _OnAcceleratorVersionListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.String.class),
                    Convert(objects[3], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnAcceleratorConnected",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnAcceleratorConnectedEventHandler handler :
                  _OnAcceleratorConnectedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.String.class),
                    Convert(objects[3], java.lang.Byte.class),
                    Convert(objects[4], java.lang.Byte.class),
                    Convert(objects[5], java.lang.Integer.class),
                    Convert(objects[6], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnLoadBalancerStatistics",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnLoadBalancerStatisticsEventHandler handler :
                  _OnLoadBalancerStatisticsListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class),
                    Convert(objects[4], java.lang.Integer.class),
                    Convert(objects[5], java.lang.Double.class),
                    Convert(objects[6], java.lang.Double.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnShutdown",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnShutdownEventHandler handler : _OnShutdownListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnGroupState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnGroupStateEventHandler handler : _OnGroupStateListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnServerGroupModified",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnServerGroupModifiedEventHandler handler :
                  _OnServerGroupModifiedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class),
                    Convert(objects[2], java.lang.Integer.class),
                    Convert(objects[3], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnSystemState",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnSystemStateEventHandler handler : _OnSystemStateListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Byte.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnBackPressure",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnBackPressureEventHandler handler : _OnBackPressureListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Byte.class),
                    Convert(objects[2], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnMatchingModeChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnMatchingModeChangedEventHandler handler :
                  _OnMatchingModeChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnMatchPriorityChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnMatchPriorityChangedEventHandler handler :
                  _OnMatchPriorityChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnMatchCountChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (_IDMSDKEvents_OnMatchCountChangedEventHandler handler :
                  _OnMatchCountChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Integer.class),
                    Convert(objects[1], java.lang.Integer.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DMSDKClass(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
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
      AtomicReference<java.lang.Integer> MatchPriority) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "Open",
                  IPAddress,
                  UserID,
                  Password,
                  new NOut(SessionID, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(UserType, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  DateTime,
                  new NOut(
                      AcceleratorMode, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      StandAloneMode, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(ConnectedType, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      MatchPriority, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Close() {
    try {
      java.lang.Integer res = javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("Close");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InstallCertificate(java.lang.String ClientCertPath) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("InstallCertificate", ClientCertPath);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer DeleteCertificate() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("DeleteCertificate");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllIrisAccelerators(
      AtomicReference<java.lang.Integer> NumOfServers,
      Object ServerIDs,
      Object ServerIPs,
      Object ServerStatus,
      Object ServerType,
      Object GroupIDs,
      Object GroupNumber) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetAllIrisAccelerators",
                  new NOut(
                      NumOfServers, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  ServerIDs,
                  ServerIPs,
                  ServerStatus,
                  ServerType,
                  GroupIDs,
                  GroupNumber);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetControllerConf(IACONTROLLERCONF ServerConfig) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("GetControllerConf", ServerConfig);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetControllerStat(IACONTROLLERSTAT ServerStat) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("GetControllerStat", ServerStat);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSabreConf(IASABRECONF SabreConfig) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("GetSabreConf", SabreConfig);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSabreStat(IASABRESTAT SabreStat) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("GetSabreStat", SabreStat);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetLoadBalancerConf(IALOADBALANCERCONF ServerConfig) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("GetLoadBalancerConf", ServerConfig);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetLoadBalancerStat(IALOADBALANCERSTAT ServerStat) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("GetLoadBalancerStat", ServerStat);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHamingThreshold(
      AtomicReference<java.lang.Byte> ServerCalculated,
      AtomicReference<java.lang.Double> HammingThreshold,
      AtomicReference<java.lang.Byte> ServerCalculatedBothEye,
      AtomicReference<java.lang.Double> HammingThresholdBothEye) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetHamingThreshold",
                  new NOut(
                      ServerCalculated, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      HammingThreshold, JavonetHelper.JavaToDotnetType.get(java.lang.Double.class)),
                  new NOut(
                      ServerCalculatedBothEye,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      HammingThresholdBothEye,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Double.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetHammingThresholdSingleEye(
      java.lang.Byte ServerCalculated, java.lang.Double HammingThreshold) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("SetHammingThresholdSingleEye", ServerCalculated, HammingThreshold);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetHammingThresholdBothEye(
      java.lang.Byte ServerCalculated, java.lang.Double HammingThreshold) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("SetHammingThresholdBothEye", ServerCalculated, HammingThreshold);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetQualityThreshold(
      AtomicReference<java.lang.Integer> QualityThreshold) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetQualityThreshold",
                  new NOut(
                      QualityThreshold,
                      JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetQualityThreshold(java.lang.Integer QualityThreshold) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("SetQualityThreshold", QualityThreshold);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetMatchingMode(java.lang.Integer MatchingMode) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("SetMatchingMode", MatchingMode);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetMatchPriority(java.lang.Integer MatchPriority) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("SetMatchPriority", MatchPriority);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetGroupState(
      java.lang.Integer GroupID,
      AtomicReference<java.lang.Integer> NumberOfGroups,
      Object GroupState,
      Object GroupIDs) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetGroupState",
                  GroupID,
                  new NOut(
                      NumberOfGroups, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  GroupState,
                  GroupIDs);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer AddOperator(java.lang.String UserName, java.lang.String Password) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("AddOperator", UserName, Password);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer RemoveOperator(java.lang.String UserName) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("RemoveOperator", UserName);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllOperators(
      AtomicReference<java.lang.Integer> UserCount, Object UserIDs) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetAllOperators",
                  new NOut(UserCount, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  UserIDs);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ChangePassword(
      java.lang.String UserID, java.lang.String OldPassword, java.lang.String NewPassword) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("ChangePassword", UserID, OldPassword, NewPassword);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetLoggerSettings(
      Object LogTypes, Object LogLevels, AtomicReference<java.lang.Integer> LogCount) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetLoggerSettings",
                  LogTypes,
                  LogLevels,
                  new NOut(LogCount, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetLoggerSettings(
      Object LogTypes, Object LogLevels, java.lang.Integer LogCount) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("SetLoggerSettings", LogTypes, LogLevels, LogCount);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetClearLogSettings(
      AtomicReference<java.lang.Integer> ClearType,
      AtomicReference<java.lang.Integer> Value,
      AtomicReference<java.lang.Integer> FilesToRetain) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetClearLogSettings",
                  new NOut(ClearType, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(Value, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(
                      FilesToRetain, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetClearLogSettings(
      java.lang.Integer ClearType, java.lang.Integer Value, java.lang.Integer FilesToRetain) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke("SetClearLogSettings", ClearType, Value, FilesToRetain);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ResetStatistics() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("ResetStatistics");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Reboot(java.lang.Byte SabreReboot) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("Reboot", SabreReboot);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Shutdown() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("Shutdown");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSabreStatus(AtomicReference<java.lang.Integer> SabreStatus) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetSabreStatus",
                  new NOut(
                      SabreStatus, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Upgrade(java.lang.String FileName) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("Upgrade", FileName);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSdkVersion(Object SDKVersion) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("GetSdkVersion", SDKVersion);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetIrisAcceleratorVersion(AtomicReference<java.lang.Integer> RequestID) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetIrisAcceleratorVersion",
                  new NOut(RequestID, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
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
      AtomicReference<java.lang.Integer> MatchPriority) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "OpenEx",
                  Port,
                  IPAddress,
                  UserID,
                  Password,
                  UserData,
                  new NOut(SessionID, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(UserType, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  DateTime,
                  new NOut(
                      AcceleratorMode, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      StandAloneMode, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(ConnectedType, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  new NOut(
                      MatchPriority, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSystemState(AtomicReference<java.lang.Integer> SystemState) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetSystemState",
                  new NOut(
                      SystemState, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllPorts(IAPORTCONFIGURATION PortConfig) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("GetAllPorts", PortConfig);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetAllPorts(IAPORTCONFIGURATION PortConfig) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("SetAllPorts", PortConfig);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetMatchCount(java.lang.Integer MatchCount) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("SetMatchCount", MatchCount);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetServerTime(Object DateTime) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IADMSDKLib.IDMSDK").invoke("GetServerTime", DateTime);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllGroups(
      AtomicReference<java.lang.Integer> NumOfGroups,
      Object GroupNumber,
      Object GroupIDs,
      Object GroupStatus,
      Object GroupDescription) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetAllGroups",
                  new NOut(
                      NumOfGroups, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  GroupNumber,
                  GroupIDs,
                  GroupStatus,
                  GroupDescription);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetConfigData(
      AtomicReference<java.lang.Integer> NumOfConfigData, Object ConfigNames, Object ConfigValues) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IADMSDKLib.IDMSDK")
              .invoke(
                  "GetConfigData",
                  new NOut(
                      NumOfConfigData, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  ConfigNames,
                  ConfigValues);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnDisconnect(_IDMSDKEvents_OnDisconnectEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnDisconnect", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnDisconnect(_IDMSDKEvents_OnDisconnectEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnDisconnect", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnReboot(_IDMSDKEvents_OnRebootEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnReboot", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnReboot(_IDMSDKEvents_OnRebootEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnReboot", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnSabreStatusChanged(_IDMSDKEvents_OnSabreStatusChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnSabreStatusChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnSabreStatusChanged(_IDMSDKEvents_OnSabreStatusChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnSabreStatusChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnUpgradeComplete(_IDMSDKEvents_OnUpgradeCompleteEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnUpgradeComplete", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnUpgradeComplete(_IDMSDKEvents_OnUpgradeCompleteEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnUpgradeComplete", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnAlarm(_IDMSDKEvents_OnAlarmEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnAlarm", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAlarm(_IDMSDKEvents_OnAlarmEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnAlarm", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnLoadBalancingStatus(_IDMSDKEvents_OnLoadBalancingStatusEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnLoadBalancingStatus", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnLoadBalancingStatus(_IDMSDKEvents_OnLoadBalancingStatusEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnLoadBalancingStatus", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnSabreInfo(_IDMSDKEvents_OnSabreInfoEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnSabreInfo", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnSabreInfo(_IDMSDKEvents_OnSabreInfoEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnSabreInfo", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnIrisControllerStatistics(
      _IDMSDKEvents_OnIrisControllerStatisticsEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnIrisControllerStatistics", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnIrisControllerStatistics(
      _IDMSDKEvents_OnIrisControllerStatisticsEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnIrisControllerStatistics", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnError(_IDMSDKEvents_OnErrorEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnError", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnError(_IDMSDKEvents_OnErrorEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnError", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnAcceleratorVersion(_IDMSDKEvents_OnAcceleratorVersionEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnAcceleratorVersion", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAcceleratorVersion(_IDMSDKEvents_OnAcceleratorVersionEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnAcceleratorVersion", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnAcceleratorConnected(_IDMSDKEvents_OnAcceleratorConnectedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnAcceleratorConnected", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnAcceleratorConnected(
      _IDMSDKEvents_OnAcceleratorConnectedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnAcceleratorConnected", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnLoadBalancerStatistics(
      _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnLoadBalancerStatistics", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnLoadBalancerStatistics(
      _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnLoadBalancerStatistics", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnShutdown(_IDMSDKEvents_OnShutdownEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnShutdown", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnShutdown(_IDMSDKEvents_OnShutdownEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnShutdown", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnGroupState(_IDMSDKEvents_OnGroupStateEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnGroupState", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnGroupState(_IDMSDKEvents_OnGroupStateEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnGroupState", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnServerGroupModified(_IDMSDKEvents_OnServerGroupModifiedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnServerGroupModified", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnServerGroupModified(_IDMSDKEvents_OnServerGroupModifiedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnServerGroupModified", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnSystemState(_IDMSDKEvents_OnSystemStateEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnSystemState", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnSystemState(_IDMSDKEvents_OnSystemStateEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnSystemState", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnBackPressure(_IDMSDKEvents_OnBackPressureEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnBackPressure", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnBackPressure(_IDMSDKEvents_OnBackPressureEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnBackPressure", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnMatchingModeChanged(_IDMSDKEvents_OnMatchingModeChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnMatchingModeChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnMatchingModeChanged(_IDMSDKEvents_OnMatchingModeChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnMatchingModeChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnMatchPriorityChanged(_IDMSDKEvents_OnMatchPriorityChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnMatchPriorityChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnMatchPriorityChanged(
      _IDMSDKEvents_OnMatchPriorityChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnMatchPriorityChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void add_OnMatchCountChanged(_IDMSDKEvents_OnMatchCountChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("add_OnMatchCountChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void remove_OnMatchCountChanged(_IDMSDKEvents_OnMatchCountChangedEventHandler param0) {
    try {
      javonetHandle
          .explicitInterface("IADMSDKLib._IDMSDKEvents_Event")
          .invoke("remove_OnMatchCountChanged", param0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnDisconnectEventHandler> _OnDisconnectListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnDisconnectEventHandler>();

  public void addOnDisconnect(_IDMSDKEvents_OnDisconnectEventHandler toAdd) {
    _OnDisconnectListeners.add(toAdd);
  }

  public void removeOnDisconnect(_IDMSDKEvents_OnDisconnectEventHandler toRemove) {
    _OnDisconnectListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnRebootEventHandler> _OnRebootListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnRebootEventHandler>();

  public void addOnReboot(_IDMSDKEvents_OnRebootEventHandler toAdd) {
    _OnRebootListeners.add(toAdd);
  }

  public void removeOnReboot(_IDMSDKEvents_OnRebootEventHandler toRemove) {
    _OnRebootListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnSabreStatusChangedEventHandler>
      _OnSabreStatusChangedListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnSabreStatusChangedEventHandler>();

  public void addOnSabreStatusChanged(_IDMSDKEvents_OnSabreStatusChangedEventHandler toAdd) {
    _OnSabreStatusChangedListeners.add(toAdd);
  }

  public void removeOnSabreStatusChanged(_IDMSDKEvents_OnSabreStatusChangedEventHandler toRemove) {
    _OnSabreStatusChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnUpgradeCompleteEventHandler>
      _OnUpgradeCompleteListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnUpgradeCompleteEventHandler>();

  public void addOnUpgradeComplete(_IDMSDKEvents_OnUpgradeCompleteEventHandler toAdd) {
    _OnUpgradeCompleteListeners.add(toAdd);
  }

  public void removeOnUpgradeComplete(_IDMSDKEvents_OnUpgradeCompleteEventHandler toRemove) {
    _OnUpgradeCompleteListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnAlarmEventHandler> _OnAlarmListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnAlarmEventHandler>();

  public void addOnAlarm(_IDMSDKEvents_OnAlarmEventHandler toAdd) {
    _OnAlarmListeners.add(toAdd);
  }

  public void removeOnAlarm(_IDMSDKEvents_OnAlarmEventHandler toRemove) {
    _OnAlarmListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnLoadBalancingStatusEventHandler>
      _OnLoadBalancingStatusListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnLoadBalancingStatusEventHandler>();

  public void addOnLoadBalancingStatus(_IDMSDKEvents_OnLoadBalancingStatusEventHandler toAdd) {
    _OnLoadBalancingStatusListeners.add(toAdd);
  }

  public void removeOnLoadBalancingStatus(
      _IDMSDKEvents_OnLoadBalancingStatusEventHandler toRemove) {
    _OnLoadBalancingStatusListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnSabreInfoEventHandler> _OnSabreInfoListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnSabreInfoEventHandler>();

  public void addOnSabreInfo(_IDMSDKEvents_OnSabreInfoEventHandler toAdd) {
    _OnSabreInfoListeners.add(toAdd);
  }

  public void removeOnSabreInfo(_IDMSDKEvents_OnSabreInfoEventHandler toRemove) {
    _OnSabreInfoListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnIrisControllerStatisticsEventHandler>
      _OnIrisControllerStatisticsListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnIrisControllerStatisticsEventHandler>();

  public void addOnIrisControllerStatistics(
      _IDMSDKEvents_OnIrisControllerStatisticsEventHandler toAdd) {
    _OnIrisControllerStatisticsListeners.add(toAdd);
  }

  public void removeOnIrisControllerStatistics(
      _IDMSDKEvents_OnIrisControllerStatisticsEventHandler toRemove) {
    _OnIrisControllerStatisticsListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnErrorEventHandler> _OnErrorListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnErrorEventHandler>();

  public void addOnError(_IDMSDKEvents_OnErrorEventHandler toAdd) {
    _OnErrorListeners.add(toAdd);
  }

  public void removeOnError(_IDMSDKEvents_OnErrorEventHandler toRemove) {
    _OnErrorListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnAcceleratorVersionEventHandler>
      _OnAcceleratorVersionListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnAcceleratorVersionEventHandler>();

  public void addOnAcceleratorVersion(_IDMSDKEvents_OnAcceleratorVersionEventHandler toAdd) {
    _OnAcceleratorVersionListeners.add(toAdd);
  }

  public void removeOnAcceleratorVersion(_IDMSDKEvents_OnAcceleratorVersionEventHandler toRemove) {
    _OnAcceleratorVersionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnAcceleratorConnectedEventHandler>
      _OnAcceleratorConnectedListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnAcceleratorConnectedEventHandler>();

  public void addOnAcceleratorConnected(_IDMSDKEvents_OnAcceleratorConnectedEventHandler toAdd) {
    _OnAcceleratorConnectedListeners.add(toAdd);
  }

  public void removeOnAcceleratorConnected(
      _IDMSDKEvents_OnAcceleratorConnectedEventHandler toRemove) {
    _OnAcceleratorConnectedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnLoadBalancerStatisticsEventHandler>
      _OnLoadBalancerStatisticsListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnLoadBalancerStatisticsEventHandler>();

  public void addOnLoadBalancerStatistics(
      _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler toAdd) {
    _OnLoadBalancerStatisticsListeners.add(toAdd);
  }

  public void removeOnLoadBalancerStatistics(
      _IDMSDKEvents_OnLoadBalancerStatisticsEventHandler toRemove) {
    _OnLoadBalancerStatisticsListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnShutdownEventHandler> _OnShutdownListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnShutdownEventHandler>();

  public void addOnShutdown(_IDMSDKEvents_OnShutdownEventHandler toAdd) {
    _OnShutdownListeners.add(toAdd);
  }

  public void removeOnShutdown(_IDMSDKEvents_OnShutdownEventHandler toRemove) {
    _OnShutdownListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnGroupStateEventHandler> _OnGroupStateListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnGroupStateEventHandler>();

  public void addOnGroupState(_IDMSDKEvents_OnGroupStateEventHandler toAdd) {
    _OnGroupStateListeners.add(toAdd);
  }

  public void removeOnGroupState(_IDMSDKEvents_OnGroupStateEventHandler toRemove) {
    _OnGroupStateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnServerGroupModifiedEventHandler>
      _OnServerGroupModifiedListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnServerGroupModifiedEventHandler>();

  public void addOnServerGroupModified(_IDMSDKEvents_OnServerGroupModifiedEventHandler toAdd) {
    _OnServerGroupModifiedListeners.add(toAdd);
  }

  public void removeOnServerGroupModified(
      _IDMSDKEvents_OnServerGroupModifiedEventHandler toRemove) {
    _OnServerGroupModifiedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnSystemStateEventHandler> _OnSystemStateListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnSystemStateEventHandler>();

  public void addOnSystemState(_IDMSDKEvents_OnSystemStateEventHandler toAdd) {
    _OnSystemStateListeners.add(toAdd);
  }

  public void removeOnSystemState(_IDMSDKEvents_OnSystemStateEventHandler toRemove) {
    _OnSystemStateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnBackPressureEventHandler> _OnBackPressureListeners =
      new java.util.ArrayList<_IDMSDKEvents_OnBackPressureEventHandler>();

  public void addOnBackPressure(_IDMSDKEvents_OnBackPressureEventHandler toAdd) {
    _OnBackPressureListeners.add(toAdd);
  }

  public void removeOnBackPressure(_IDMSDKEvents_OnBackPressureEventHandler toRemove) {
    _OnBackPressureListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnMatchingModeChangedEventHandler>
      _OnMatchingModeChangedListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnMatchingModeChangedEventHandler>();

  public void addOnMatchingModeChanged(_IDMSDKEvents_OnMatchingModeChangedEventHandler toAdd) {
    _OnMatchingModeChangedListeners.add(toAdd);
  }

  public void removeOnMatchingModeChanged(
      _IDMSDKEvents_OnMatchingModeChangedEventHandler toRemove) {
    _OnMatchingModeChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnMatchPriorityChangedEventHandler>
      _OnMatchPriorityChangedListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnMatchPriorityChangedEventHandler>();

  public void addOnMatchPriorityChanged(_IDMSDKEvents_OnMatchPriorityChangedEventHandler toAdd) {
    _OnMatchPriorityChangedListeners.add(toAdd);
  }

  public void removeOnMatchPriorityChanged(
      _IDMSDKEvents_OnMatchPriorityChangedEventHandler toRemove) {
    _OnMatchPriorityChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<_IDMSDKEvents_OnMatchCountChangedEventHandler>
      _OnMatchCountChangedListeners =
          new java.util.ArrayList<_IDMSDKEvents_OnMatchCountChangedEventHandler>();

  public void addOnMatchCountChanged(_IDMSDKEvents_OnMatchCountChangedEventHandler toAdd) {
    _OnMatchCountChangedListeners.add(toAdd);
  }

  public void removeOnMatchCountChanged(_IDMSDKEvents_OnMatchCountChangedEventHandler toRemove) {
    _OnMatchCountChangedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
