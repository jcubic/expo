package expo.modules.kotlin.sharedobjects

import com.facebook.jni.HybridData
import expo.modules.core.interfaces.DoNotStrip

open class SharedObject {

  /**
   * An identifier of the native shared object that maps to the JavaScript object.
   * When the object is not linked with any JavaScript object, its value is 0.
   */
  internal var sharedObjectId: SharedObjectId = SharedObjectId(0)
}
