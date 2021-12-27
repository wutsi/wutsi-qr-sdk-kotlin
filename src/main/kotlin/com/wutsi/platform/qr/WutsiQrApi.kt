package com.wutsi.platform.qr

import com.wutsi.platform.qr.dto.CreateAccountQRCodeResponse
import com.wutsi.platform.qr.dto.CreatePaymentQRCodeRequest
import com.wutsi.platform.qr.dto.CreatePaymentQRCodeResponse
import com.wutsi.platform.qr.dto.GetKeyResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface WutsiQrApi {
  @RequestLine("POST /v1/account")
  @Headers(value=["Content-Type: application/json"])
  public fun account(): CreateAccountQRCodeResponse

  @RequestLine("POST /v1/payment")
  @Headers(value=["Content-Type: application/json"])
  public fun payment(request: CreatePaymentQRCodeRequest): CreatePaymentQRCodeResponse

  @RequestLine("GET /v1/keys/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getKey(@Param("id") id: Long): GetKeyResponse
}
