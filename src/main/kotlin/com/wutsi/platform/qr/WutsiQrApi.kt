package com.wutsi.platform.qr

import com.wutsi.platform.qr.dto.CreateAccountQRCodeResponse
import com.wutsi.platform.qr.dto.CreatePaymentQRCodeRequest
import com.wutsi.platform.qr.dto.CreatePaymentQRCodeResponse
import feign.Headers
import feign.RequestLine

public interface WutsiQrApi {
  @RequestLine("POST /v1/account")
  @Headers(value=["Content-Type: application/json"])
  public fun account(): CreateAccountQRCodeResponse

  @RequestLine("POST /v1/payment")
  @Headers(value=["Content-Type: application/json"])
  public fun payment(request: CreatePaymentQRCodeRequest): CreatePaymentQRCodeResponse
}
