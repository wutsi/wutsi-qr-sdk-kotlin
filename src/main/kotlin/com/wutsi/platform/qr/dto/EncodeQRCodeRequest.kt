package com.wutsi.platform.qr.dto

import kotlin.Int
import kotlin.String

public data class EncodeQRCodeRequest(
  public val type: String = "",
  public val id: String = "",
  public val timeToLive: Int = 0
)
