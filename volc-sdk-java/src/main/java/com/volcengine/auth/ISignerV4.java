package com.volcengine.auth;

import com.volcengine.model.Credentials;
import com.volcengine.model.RequestParam;
import com.volcengine.model.SignRequest;
import com.volcengine.service.SignableRequest;

/**
 * The interface Signer.
 */
public interface ISignerV4 {

    /**
     * Sign.
     *
     * @param request     the request
     * @param credentials the credentials
     * @throws Exception the exception
     */
    void sign(SignableRequest request, Credentials credentials) throws Exception;

    /**
     * Sign url string.
     *
     * @param request     the request
     * @param credentials the credentials
     * @return the string
     * @throws Exception the exception
     */
    String signUrl(SignableRequest request, Credentials credentials) throws Exception;

    /**
     * Sign by request parameter
     *
     * @param requestParam the request parameter
     * @param credentials  the credentials
     * @return the sign request
     * @throws Exception the exception
     */
    SignRequest getSignRequest(RequestParam requestParam, Credentials credentials) throws Exception;
}
