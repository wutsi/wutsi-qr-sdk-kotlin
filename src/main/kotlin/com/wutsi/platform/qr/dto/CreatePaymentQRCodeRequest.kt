package com.wutsi.platform.qr.dto

import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class CreatePaymentQRCodeRequest(
  public val referenceId: String = "",
  public val merchantId: Long = 0,
  public val amount: Double = 0.0,
  public val currency: String = "",
  public val timeToLive: Int? = null
)
