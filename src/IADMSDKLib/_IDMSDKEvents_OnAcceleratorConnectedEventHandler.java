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

public interface _IDMSDKEvents_OnAcceleratorConnectedEventHandler {
  /** Method */
  @MethodTypeAnnotation(type = "DelegateMethod")
  public void Invoke(
      java.lang.Integer SessionID,
      java.lang.Integer AcceleratorID,
      java.lang.String IPAddress,
      java.lang.Byte Status,
      java.lang.Byte ConnectionType,
      java.lang.Integer GroupID,
      java.lang.Integer GroupNumber);
}
