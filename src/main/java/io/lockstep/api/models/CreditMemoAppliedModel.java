
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
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;
public class CreditMemoAppliedModel
{
    private String creditMemoAppliedId;
    private String groupKey;
    private String invoiceId;
    private String creditMemoInvoiceId;
    private String erpKey;
    private Integer entryNumber;
    private Date applyToInvoiceDate;
    private Double creditMemoAppliedAmount;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private AttachmentModel[] attachments;
    private NoteModel[] notes;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreditMemoAppliedId() { return this.creditMemoAppliedId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreditMemoAppliedId(String value) { this.creditMemoAppliedId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The id of the invoice
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The id of the invoice
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The id of the credit memo invoice
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreditMemoInvoiceId() { return this.creditMemoInvoiceId; }
    /**
     * The id of the credit memo invoice
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreditMemoInvoiceId(String value) { this.creditMemoInvoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return a {@link java.lang.String} object.
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * Reference number for the applied credit memo.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getEntryNumber() { return this.entryNumber; }
    /**
     * Reference number for the applied credit memo.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setEntryNumber(Integer value) { this.entryNumber = value; }
    /**
     * Date payment applied to credit memo.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getApplyToInvoiceDate() { return this.applyToInvoiceDate; }
    /**
     * Date payment applied to credit memo.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setApplyToInvoiceDate(Date value) { this.applyToInvoiceDate = value; }
    /**
     * Amount applied to credit memo.
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getCreditMemoAppliedAmount() { return this.creditMemoAppliedAmount; }
    /**
     * Amount applied to credit memo.
     *
     * @param value a {@link java.lang.Double} object.
     */
    public void setCreditMemoAppliedAmount(Double value) { this.creditMemoAppliedAmount = value; }
    /**
     * Date credit memo applied record was created.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getCreated() { return this.created; }
    /**
     * Date credit memo applied record was created.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The id of the user who created this applied credit memo.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The id of the user who created this applied credit memo.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * Date credit memo applied record was modified.
     *
     * @return a {@link java.util.Date} object.
     */
    public Date getModified() { return this.modified; }
    /**
     * Date credit memo applied record was modified.
     *
     * @param value a {@link java.util.Date} object.
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The id of the user who modified this applied credit memo.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The id of the user who modified this applied credit memo.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to applied Credit Memo.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.AttachmentModel} objects.
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this applied Credit Memo.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.NoteModel} objects.
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this applied Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldDefinitionModel} objects.
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this Credit Memo.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value an array of {@link io.lockstep.api.models.CustomFieldValueModel} objects.
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};
