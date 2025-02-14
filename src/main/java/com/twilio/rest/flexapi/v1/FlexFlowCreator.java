/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.flexapi.v1;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;

public class FlexFlowCreator extends Creator<FlexFlow> {
    private final String friendlyName;
    private final String chatServiceSid;
    private final FlexFlow.ChannelType channelType;
    private String contactIdentity;
    private Boolean enabled;
    private FlexFlow.IntegrationType integrationType;
    private String integrationFlowSid;
    private URI integrationUrl;
    private String integrationWorkspaceSid;
    private String integrationWorkflowSid;
    private String integrationChannel;
    private Integer integrationTimeout;
    private Integer integrationPriority;
    private Boolean integrationCreationOnMessage;
    private Boolean longLived;
    private Boolean janitorEnabled;
    private Integer integrationRetryCount;

    /**
     * Construct a new FlexFlowCreator.
     *
     * @param friendlyName A string to describe the resource
     * @param chatServiceSid The SID of the chat service
     * @param channelType The channel type
     */
    public FlexFlowCreator(final String friendlyName,
                           final String chatServiceSid,
                           final FlexFlow.ChannelType channelType) {
        this.friendlyName = friendlyName;
        this.chatServiceSid = chatServiceSid;
        this.channelType = channelType;
    }

    /**
     * The channel contact's Identity..
     *
     * @param contactIdentity The channel contact's Identity
     * @return this
     */
    public FlexFlowCreator setContactIdentity(final String contactIdentity) {
        this.contactIdentity = contactIdentity;
        return this;
    }

    /**
     * Whether the new Flex Flow is enabled..
     *
     * @param enabled Whether the new Flex Flow is enabled
     * @return this
     */
    public FlexFlowCreator setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * The software that will handle inbound messages. <a
     * href="https://www.twilio.com/docs/flex/developer/messaging/manage-flows#integration-types">Integration
     * Type</a> can be: `studio`, `external`, or `task`..
     *
     * @param integrationType The software that will handle inbound messages.
     * @return this
     */
    public FlexFlowCreator setIntegrationType(final FlexFlow.IntegrationType integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    /**
     * The SID of the Studio Flow. Required when `integrationType` is `studio`..
     *
     * @param integrationFlowSid The SID of the Studio Flow
     * @return this
     */
    public FlexFlowCreator setIntegrationFlowSid(final String integrationFlowSid) {
        this.integrationFlowSid = integrationFlowSid;
        return this;
    }

    /**
     * The URL of the external webhook. Required when `integrationType` is
     * `external`..
     *
     * @param integrationUrl The External Webhook URL
     * @return this
     */
    public FlexFlowCreator setIntegrationUrl(final URI integrationUrl) {
        this.integrationUrl = integrationUrl;
        return this;
    }

    /**
     * The URL of the external webhook. Required when `integrationType` is
     * `external`..
     *
     * @param integrationUrl The External Webhook URL
     * @return this
     */
    public FlexFlowCreator setIntegrationUrl(final String integrationUrl) {
        return setIntegrationUrl(Promoter.uriFromString(integrationUrl));
    }

    /**
     * The Workspace SID for a new Task. Required when `integrationType` is `task`..
     *
     * @param integrationWorkspaceSid The Workspace SID for a new Task
     * @return this
     */
    public FlexFlowCreator setIntegrationWorkspaceSid(final String integrationWorkspaceSid) {
        this.integrationWorkspaceSid = integrationWorkspaceSid;
        return this;
    }

    /**
     * The Workflow SID for a new Task. Required when `integrationType` is `task`..
     *
     * @param integrationWorkflowSid The Workflow SID for a new Task
     * @return this
     */
    public FlexFlowCreator setIntegrationWorkflowSid(final String integrationWorkflowSid) {
        this.integrationWorkflowSid = integrationWorkflowSid;
        return this;
    }

    /**
     * The Task Channel SID (TCXXXX) or unique name (e.g., `sms`) to use for the
     * Task that will be created. Applicable and required when `integrationType` is
     * `task`. The default value is `default`..
     *
     * @param integrationChannel The Task Channel for a new Task
     * @return this
     */
    public FlexFlowCreator setIntegrationChannel(final String integrationChannel) {
        this.integrationChannel = integrationChannel;
        return this;
    }

    /**
     * The Task timeout in seconds for a new Task. Default is 86,400 seconds (24
     * hours). Optional when `integrationType` is `task`, not applicable otherwise..
     *
     * @param integrationTimeout The Task timeout in seconds for a new Task
     * @return this
     */
    public FlexFlowCreator setIntegrationTimeout(final Integer integrationTimeout) {
        this.integrationTimeout = integrationTimeout;
        return this;
    }

    /**
     * The Task priority of a new Task. The default priority is 0. Optional when
     * `integrationType` is `task`, not applicable otherwise..
     *
     * @param integrationPriority The Task priority of a new Task
     * @return this
     */
    public FlexFlowCreator setIntegrationPriority(final Integer integrationPriority) {
        this.integrationPriority = integrationPriority;
        return this;
    }

    /**
     * In the context of outbound messaging, defines whether to create a Task
     * immediately (and therefore reserve the conversation to current agent), or
     * delay Task creation until the customer sends the first response. Set to false
     * to create immediately, true to delay Task creation. This setting is only
     * applicable for outbound messaging..
     *
     * @param integrationCreationOnMessage Whether to create a Task when the first
     *                                     message arrives
     * @return this
     */
    public FlexFlowCreator setIntegrationCreationOnMessage(final Boolean integrationCreationOnMessage) {
        this.integrationCreationOnMessage = integrationCreationOnMessage;
        return this;
    }

    /**
     * When enabled, Flex will keep the chat channel active so that it may be used
     * for subsequent interactions with a contact identity. Defaults to `false`..
     *
     * @param longLived Reuse this chat channel for future interactions with a
     *                  contact
     * @return this
     */
    public FlexFlowCreator setLongLived(final Boolean longLived) {
        this.longLived = longLived;
        return this;
    }

    /**
     * When enabled, the Messaging Channel Janitor will remove active Proxy sessions
     * if the associated Task is deleted outside of the Flex UI. Defaults to
     * `false`..
     *
     * @param janitorEnabled Remove active Proxy sessions if the corresponding Task
     *                       is deleted
     * @return this
     */
    public FlexFlowCreator setJanitorEnabled(final Boolean janitorEnabled) {
        this.janitorEnabled = janitorEnabled;
        return this;
    }

    /**
     * The number of times to retry the Studio Flow or webhook in case of failure.
     * Takes integer values from 0 to 3 with the default being 3. Optional when
     * `integrationType` is `studio` or `external`, not applicable otherwise..
     *
     * @param integrationRetryCount The number of times to retry the Studio Flow or
     *                              webhook in case of failure
     * @return this
     */
    public FlexFlowCreator setIntegrationRetryCount(final Integer integrationRetryCount) {
        this.integrationRetryCount = integrationRetryCount;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created FlexFlow
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public FlexFlow create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.FLEXAPI.toString(),
            "/v1/FlexFlows"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("FlexFlow creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return FlexFlow.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (chatServiceSid != null) {
            request.addPostParam("ChatServiceSid", chatServiceSid);
        }

        if (channelType != null) {
            request.addPostParam("ChannelType", channelType.toString());
        }

        if (contactIdentity != null) {
            request.addPostParam("ContactIdentity", contactIdentity);
        }

        if (enabled != null) {
            request.addPostParam("Enabled", enabled.toString());
        }

        if (integrationType != null) {
            request.addPostParam("IntegrationType", integrationType.toString());
        }

        if (integrationFlowSid != null) {
            request.addPostParam("Integration.FlowSid", integrationFlowSid);
        }

        if (integrationUrl != null) {
            request.addPostParam("Integration.Url", integrationUrl.toString());
        }

        if (integrationWorkspaceSid != null) {
            request.addPostParam("Integration.WorkspaceSid", integrationWorkspaceSid);
        }

        if (integrationWorkflowSid != null) {
            request.addPostParam("Integration.WorkflowSid", integrationWorkflowSid);
        }

        if (integrationChannel != null) {
            request.addPostParam("Integration.Channel", integrationChannel);
        }

        if (integrationTimeout != null) {
            request.addPostParam("Integration.Timeout", integrationTimeout.toString());
        }

        if (integrationPriority != null) {
            request.addPostParam("Integration.Priority", integrationPriority.toString());
        }

        if (integrationCreationOnMessage != null) {
            request.addPostParam("Integration.CreationOnMessage", integrationCreationOnMessage.toString());
        }

        if (longLived != null) {
            request.addPostParam("LongLived", longLived.toString());
        }

        if (janitorEnabled != null) {
            request.addPostParam("JanitorEnabled", janitorEnabled.toString());
        }

        if (integrationRetryCount != null) {
            request.addPostParam("Integration.RetryCount", integrationRetryCount.toString());
        }
    }
}