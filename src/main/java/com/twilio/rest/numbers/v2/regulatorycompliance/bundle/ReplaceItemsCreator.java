/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance.bundle;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ReplaceItemsCreator extends Creator<ReplaceItems> {
    private final String pathBundleSid;
    private final String fromBundleSid;

    /**
     * Construct a new ReplaceItemsCreator.
     *
     * @param pathBundleSid The unique string that identifies the Bundle where the
     *                      item assignments are going to be replaced
     * @param fromBundleSid The source bundle sid to copy the item assignments from
     */
    public ReplaceItemsCreator(final String pathBundleSid,
                               final String fromBundleSid) {
        this.pathBundleSid = pathBundleSid;
        this.fromBundleSid = fromBundleSid;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created ReplaceItems
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public ReplaceItems create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.NUMBERS.toString(),
            "/v2/RegulatoryCompliance/Bundles/" + this.pathBundleSid + "/ReplaceItems"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("ReplaceItems creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ReplaceItems.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (fromBundleSid != null) {
            request.addPostParam("FromBundleSid", fromBundleSid);
        }
    }
}