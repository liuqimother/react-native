/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.utils

object Os {

  fun isWindows(): Boolean =
      System.getProperty("os.name")?.lowercase()?.contains("windows") ?: false

  fun String.unixifyPath() =
      this.replace('\\', '/').replace(":", "").let {
        if (!it.startsWith("/")) {
          "/$it"
        } else {
          it
        }
      }
}
