
/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents the Webhook Trigger History
 */
public class WebhookHistoryTableStorageModel
{
    private @NotNull String groupKey;
    private @NotNull String webhookId;
    private @NotNull String webhookHistoryId;
    private @Nullable String eventType;
    private @NotNull Boolean requestSent;
    private @NotNull Boolean isSuccessful;
    private @Nullable String responseStatusCode;
    private @Nullable String processResultMessage;
    private @NotNull Integer failureCount;
    private @Nullable String timestamp;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public @NotNull String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(@NotNull String value) { this.groupKey = value; }
    /**
     * The WebhookId uniquely identifies the webhook used to send notification that an event action has taken place.
     *
     * @return The field webhookId
     */
    public @NotNull String getWebhookId() { return this.webhookId; }
    /**
     * The WebhookId uniquely identifies the webhook used to send notification that an event action has taken place.
     *
     * @param value The new value for webhookId
     */
    public void setWebhookId(@NotNull String value) { this.webhookId = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @return The field webhookHistoryId
     */
    public @NotNull String getWebhookHistoryId() { return this.webhookHistoryId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * @param value The new value for webhookHistoryId
     */
    public void setWebhookHistoryId(@NotNull String value) { this.webhookHistoryId = value; }
    /**
     * Event type which fired webhook
     *
     * [entity].[action]
     *
     * @return The field eventType
     */
    public @Nullable String getEventType() { return this.eventType; }
    /**
     * Event type which fired webhook
     *
     * [entity].[action]
     *
     * @param value The new value for eventType
     */
    public void setEventType(@Nullable String value) { this.eventType = value; }
    /**
     * Flag whether request was sent to callback url successfully or blocked by failing or because it was disabled.
     *
     * @return The field requestSent
     */
    public @NotNull Boolean getRequestSent() { return this.requestSent; }
    /**
     * Flag whether request was sent to callback url successfully or blocked by failing or because it was disabled.
     *
     * @param value The new value for requestSent
     */
    public void setRequestSent(@NotNull Boolean value) { this.requestSent = value; }
    /**
     * Flag whether webhook notification was successful overall (if webhook disabled should always return true otherwise
     * depends on the response from the callback url)
     *
     * @return The field isSuccessful
     */
    public @NotNull Boolean getIsSuccessful() { return this.isSuccessful; }
    /**
     * Flag whether webhook notification was successful overall (if webhook disabled should always return true otherwise
     * depends on the response from the callback url)
     *
     * @param value The new value for isSuccessful
     */
    public void setIsSuccessful(@NotNull Boolean value) { this.isSuccessful = value; }
    /**
     * Response status code that is returned when calling a callback url.
     *
     * @return The field responseStatusCode
     */
    public @Nullable String getResponseStatusCode() { return this.responseStatusCode; }
    /**
     * Response status code that is returned when calling a callback url.
     *
     * @param value The new value for responseStatusCode
     */
    public void setResponseStatusCode(@Nullable String value) { this.responseStatusCode = value; }
    /**
     * Message containing information about the webhook callback results
     *
     * @return The field processResultMessage
     */
    public @Nullable String getProcessResultMessage() { return this.processResultMessage; }
    /**
     * Message containing information about the webhook callback results
     *
     * @param value The new value for processResultMessage
     */
    public void setProcessResultMessage(@Nullable String value) { this.processResultMessage = value; }
    /**
     * Number of times message failed to be sent over to callback url before succeeding or failing out.
     * The maximum value should is based on webhook.
     *
     * @return The field failureCount
     */
    public @NotNull Integer getFailureCount() { return this.failureCount; }
    /**
     * Number of times message failed to be sent over to callback url before succeeding or failing out.
     * The maximum value should is based on webhook.
     *
     * @param value The new value for failureCount
     */
    public void setFailureCount(@NotNull Integer value) { this.failureCount = value; }
    /**
     * Timestamp of when a request is sent to a webhook callback.
     * Contains the last time message is sent if failures occur.
     *
     * @return The field timestamp
     */
    public @Nullable String getTimestamp() { return this.timestamp; }
    /**
     * Timestamp of when a request is sent to a webhook callback.
     * Contains the last time message is sent if failures occur.
     *
     * @param value The new value for timestamp
     */
    public void setTimestamp(@Nullable String value) { this.timestamp = value; }
};
