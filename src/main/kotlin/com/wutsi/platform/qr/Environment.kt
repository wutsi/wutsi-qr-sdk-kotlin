package com.wutsi.platform.qr

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-qr-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-qr-server-prod.herokuapp.com"),
  ;
}
