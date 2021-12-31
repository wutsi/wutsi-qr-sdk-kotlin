package com.wutsi.platform.qr

import com.wutsi.platform.qr.dto.DecodeQRCodeRequest
import com.wutsi.platform.qr.dto.DecodeQRCodeResponse
import com.wutsi.platform.qr.dto.EncodeQRCodeRequest
import com.wutsi.platform.qr.dto.EncodeQRCodeResponse
import feign.Headers
import feign.RequestLine

public interface WutsiQrApi {
  @RequestLine("POST /v1/encoder")
  @Headers(value=["Content-Type: application/json"])
  public fun encode(request: EncodeQRCodeRequest): EncodeQRCodeResponse

  @RequestLine("POST /v1/decoder")
  @Headers(value=["Content-Type: application/json"])
  public fun decode(request: DecodeQRCodeRequest): DecodeQRCodeResponse
}
