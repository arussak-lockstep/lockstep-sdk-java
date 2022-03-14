
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
 * An Invoice represents a bill sent from one company to another.  The creator of the invoice is identified
 * by the `CompanyId` field, and the recipient of the invoice is identified by the `CustomerId` field.  Most
 * invoices are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was
 * generated by the system that originated the invoice.  Invoices have a total amount and a due date, and when
 * some payments have been made on the Invoice the `TotalAmount` and the `OutstandingBalanceAmount` may be
 * different.
 */
public class InvoiceModel
{
    private @NotNull String groupKey;
    private @NotNull String invoiceId;
    private @NotNull String companyId;
    private @NotNull String customerId;
    private @Nullable String erpKey;
    private @Nullable String purchaseOrderCode;
    private @Nullable String referenceCode;
    private @Nullable String salespersonCode;
    private @Nullable String salespersonName;
    private @Nullable String invoiceTypeCode;
    private @Nullable String invoiceStatusCode;
    private @Nullable String termsCode;
    private @Nullable String specialTerms;
    private @Nullable String currencyCode;
    private @Nullable Double totalAmount;
    private @Nullable Double salesTaxAmount;
    private @Nullable Double discountAmount;
    private @Nullable Double outstandingBalanceAmount;
    private @Nullable String invoiceDate;
    private @Nullable String discountDate;
    private @Nullable String postedDate;
    private @Nullable String invoiceClosedDate;
    private @Nullable String paymentDueDate;
    private @Nullable String importedDate;
    private @Nullable String primaryOriginAddressId;
    private @Nullable String primaryBillToAddressId;
    private @Nullable String primaryShipToAddressId;
    private @Nullable String created;
    private @Nullable String createdUserId;
    private @Nullable String modified;
    private @Nullable String modifiedUserId;
    private @Nullable String appEnrollmentId;
    private @NotNull Boolean isVoided;
    private @NotNull Boolean inDispute;
    private @NotNull Boolean excludeFromAging;
    private @Nullable InvoiceAddressModel[] addresses;
    private @Nullable InvoiceLineModel[] lines;
    private @Nullable InvoicePaymentDetailModel[] payments;
    private @Nullable NoteModel[] notes;
    private @Nullable AttachmentModel[] attachments;
    private @Nullable CompanyModel company;
    private @Nullable CompanyModel customer;
    private @Nullable ContactModel customerPrimaryContact;
    private @Nullable CreditMemoInvoiceModel[] creditMemos;
    private @Nullable CustomFieldValueModel[] customFieldValues;
    private @Nullable CustomFieldDefinitionModel[] customFieldDefinitions;

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
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field invoiceId
     */
    public @NotNull String getInvoiceId() { return this.invoiceId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(@NotNull String value) { this.invoiceId = value; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @return The field companyId
     */
    public @NotNull String getCompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(@NotNull String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return The field customerId
     */
    public @NotNull String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@NotNull String value) { this.customerId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public @Nullable String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(@Nullable String value) { this.erpKey = value; }
    /**
     * The "Purchase Order Code" is a code that is sometimes used by companies to refer to the original PO
     * that was sent that caused this invoice to be written.  If a customer sends a purchase order to a vendor,
     * the vendor can then create an invoice and refer back to the originating purchase order using this field.
     *
     * @return The field purchaseOrderCode
     */
    public @Nullable String getPurchaseOrderCode() { return this.purchaseOrderCode; }
    /**
     * The "Purchase Order Code" is a code that is sometimes used by companies to refer to the original PO
     * that was sent that caused this invoice to be written.  If a customer sends a purchase order to a vendor,
     * the vendor can then create an invoice and refer back to the originating purchase order using this field.
     *
     * @param value The new value for purchaseOrderCode
     */
    public void setPurchaseOrderCode(@Nullable String value) { this.purchaseOrderCode = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field referenceCode
     */
    public @Nullable String getReferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(@Nullable String value) { this.referenceCode = value; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @return The field salespersonCode
     */
    public @Nullable String getSalespersonCode() { return this.salespersonCode; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @param value The new value for salespersonCode
     */
    public void setSalespersonCode(@Nullable String value) { this.salespersonCode = value; }
    /**
     * A name identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @return The field salespersonName
     */
    public @Nullable String getSalespersonName() { return this.salespersonName; }
    /**
     * A name identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @param value The new value for salespersonName
     */
    public void setSalespersonName(@Nullable String value) { this.salespersonName = value; }
    /**
     * A code identifying the type of this invoice.
     *
     * Recognized Invoice types are:
     * * `Invoice` - Represents an invoice sent by Company to the Customer
     * * `AP Invoice` - Represents an invoice sent by Customer to the Company
     * * `Credit Memo` - Represents a credit memo generated by Customer given to Company
     *
     * @return The field invoiceTypeCode
     */
    public @Nullable String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this invoice.
     *
     * Recognized Invoice types are:
     * * `Invoice` - Represents an invoice sent by Company to the Customer
     * * `AP Invoice` - Represents an invoice sent by Customer to the Company
     * * `Credit Memo` - Represents a credit memo generated by Customer given to Company
     *
     * @param value The new value for invoiceTypeCode
     */
    public void setInvoiceTypeCode(@Nullable String value) { this.invoiceTypeCode = value; }
    /**
     * A code identifying the status of this invoice.
     *
     * Recognized Invoice status codes are:
     * * `Open` - Represents an invoice that is considered open and needs more work to complete
     * * `Closed` - Represents an invoice that is considered closed and resolved
     *
     * @return The field invoiceStatusCode
     */
    public @Nullable String getInvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     *
     * Recognized Invoice status codes are:
     * * `Open` - Represents an invoice that is considered open and needs more work to complete
     * * `Closed` - Represents an invoice that is considered closed and resolved
     *
     * @param value The new value for invoiceStatusCode
     */
    public void setInvoiceStatusCode(@Nullable String value) { this.invoiceStatusCode = value; }
    /**
     * A code identifying the terms given to the purchaser.  This field is imported directly from the originating
     * financial system and does not follow a specified format.
     *
     * @return The field termsCode
     */
    public @Nullable String getTermsCode() { return this.termsCode; }
    /**
     * A code identifying the terms given to the purchaser.  This field is imported directly from the originating
     * financial system and does not follow a specified format.
     *
     * @param value The new value for termsCode
     */
    public void setTermsCode(@Nullable String value) { this.termsCode = value; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @return The field specialTerms
     */
    public @Nullable String getSpecialTerms() { return this.specialTerms; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @param value The new value for specialTerms
     */
    public void setSpecialTerms(@Nullable String value) { this.specialTerms = value; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     *
     * @return The field currencyCode
     */
    public @Nullable String getCurrencyCode() { return this.currencyCode; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(@Nullable String value) { this.currencyCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @return The field totalAmount
     */
    public @Nullable Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(@Nullable Double value) { this.totalAmount = value; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @return The field salesTaxAmount
     */
    public @Nullable Double getSalesTaxAmount() { return this.salesTaxAmount; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @param value The new value for salesTaxAmount
     */
    public void setSalesTaxAmount(@Nullable Double value) { this.salesTaxAmount = value; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @return The field discountAmount
     */
    public @Nullable Double getDiscountAmount() { return this.discountAmount; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @param value The new value for discountAmount
     */
    public void setDiscountAmount(@Nullable Double value) { this.discountAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return The field outstandingBalanceAmount
     */
    public @Nullable Double getOutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value The new value for outstandingBalanceAmount
     */
    public void setOutstandingBalanceAmount(@Nullable Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The reporting date for this invoice.
     *
     * @return The field invoiceDate
     */
    public @Nullable String getInvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     *
     * @param value The new value for invoiceDate
     */
    public void setInvoiceDate(@Nullable String value) { this.invoiceDate = value; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @return The field discountDate
     */
    public @Nullable String getDiscountDate() { return this.discountDate; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @param value The new value for discountDate
     */
    public void setDiscountDate(@Nullable String value) { this.discountDate = value; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @return The field postedDate
     */
    public @Nullable String getPostedDate() { return this.postedDate; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @param value The new value for postedDate
     */
    public void setPostedDate(@Nullable String value) { this.postedDate = value; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @return The field invoiceClosedDate
     */
    public @Nullable String getInvoiceClosedDate() { return this.invoiceClosedDate; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @param value The new value for invoiceClosedDate
     */
    public void setInvoiceClosedDate(@Nullable String value) { this.invoiceClosedDate = value; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @return The field paymentDueDate
     */
    public @Nullable String getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @param value The new value for paymentDueDate
     */
    public void setPaymentDueDate(@Nullable String value) { this.paymentDueDate = value; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @return The field importedDate
     */
    public @Nullable String getImportedDate() { return this.importedDate; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @param value The new value for importedDate
     */
    public void setImportedDate(@Nullable String value) { this.importedDate = value; }
    /**
     * The ID number of the invoice's origination address
     *
     * @return The field primaryOriginAddressId
     */
    public @Nullable String getPrimaryOriginAddressId() { return this.primaryOriginAddressId; }
    /**
     * The ID number of the invoice's origination address
     *
     * @param value The new value for primaryOriginAddressId
     */
    public void setPrimaryOriginAddressId(@Nullable String value) { this.primaryOriginAddressId = value; }
    /**
     * The ID number of the invoice's bill-to address
     *
     * @return The field primaryBillToAddressId
     */
    public @Nullable String getPrimaryBillToAddressId() { return this.primaryBillToAddressId; }
    /**
     * The ID number of the invoice's bill-to address
     *
     * @param value The new value for primaryBillToAddressId
     */
    public void setPrimaryBillToAddressId(@Nullable String value) { this.primaryBillToAddressId = value; }
    /**
     * The ID number of the invoice's ship-to address
     *
     * @return The field primaryShipToAddressId
     */
    public @Nullable String getPrimaryShipToAddressId() { return this.primaryShipToAddressId; }
    /**
     * The ID number of the invoice's ship-to address
     *
     * @param value The new value for primaryShipToAddressId
     */
    public void setPrimaryShipToAddressId(@Nullable String value) { this.primaryShipToAddressId = value; }
    /**
     * The date on which this invoice record was created.
     *
     * @return The field created
     */
    public @Nullable String getCreated() { return this.created; }
    /**
     * The date on which this invoice record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(@Nullable String value) { this.created = value; }
    /**
     * The ID number of the user who created this invoice.
     *
     * @return The field createdUserId
     */
    public @Nullable String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this invoice.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(@Nullable String value) { this.createdUserId = value; }
    /**
     * The date on which this invoice record was last modified.
     *
     * @return The field modified
     */
    public @Nullable String getModified() { return this.modified; }
    /**
     * The date on which this invoice record was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(@Nullable String value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this invoice.
     *
     * @return The field modifiedUserId
     */
    public @Nullable String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this invoice.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(@Nullable String value) { this.modifiedUserId = value; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @return The field appEnrollmentId
     */
    public @Nullable String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * The AppEnrollmentId of the application that imported this record.  For accounts
     * with more than one financial system connected, this field identifies the originating
     * financial system that produced this record.  This value is null if this record
     * was not loaded from an external ERP or financial system.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(@Nullable String value) { this.appEnrollmentId = value; }
    /**
     * Is the invoice voided?
     *
     * @return The field isVoided
     */
    public @NotNull Boolean getIsVoided() { return this.isVoided; }
    /**
     * Is the invoice voided?
     *
     * @param value The new value for isVoided
     */
    public void setIsVoided(@NotNull Boolean value) { this.isVoided = value; }
    /**
     * Is the invoice in dispute?
     *
     * @return The field inDispute
     */
    public @NotNull Boolean getInDispute() { return this.inDispute; }
    /**
     * Is the invoice in dispute?
     *
     * @param value The new value for inDispute
     */
    public void setInDispute(@NotNull Boolean value) { this.inDispute = value; }
    /**
     * Should the invoice be excluded from aging calculations?
     *
     * @return The field excludeFromAging
     */
    public @NotNull Boolean getExcludeFromAging() { return this.excludeFromAging; }
    /**
     * Should the invoice be excluded from aging calculations?
     *
     * @param value The new value for excludeFromAging
     */
    public void setExcludeFromAging(@NotNull Boolean value) { this.excludeFromAging = value; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     *
     * @return The field addresses
     */
    public @Nullable InvoiceAddressModel[] getAddresses() { return this.addresses; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     *
     * @param value The new value for addresses
     */
    public void setAddresses(@Nullable InvoiceAddressModel[] value) { this.addresses = value; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     *
     * @return The field lines
     */
    public @Nullable InvoiceLineModel[] getLines() { return this.lines; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     *
     * @param value The new value for lines
     */
    public void setLines(@Nullable InvoiceLineModel[] value) { this.lines = value; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     *
     * @return The field payments
     */
    public @Nullable InvoicePaymentDetailModel[] getPayments() { return this.payments; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     *
     * @param value The new value for payments
     */
    public void setPayments(@Nullable InvoicePaymentDetailModel[] value) { this.payments = value; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field notes
     */
    public @Nullable NoteModel[] getNotes() { return this.notes; }
    /**
     * A collection of notes linked to this record.  To retrieve this collection, specify `Notes` in the
     * `include` parameter when retrieving data.
     *
     * To create a note, use the [Create Note](https://developer.lockstep.io/reference/post_api-v1-notes)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable NoteModel[] value) { this.notes = value; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field attachments
     */
    public @Nullable AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * A collection of attachments linked to this record.  To retrieve this collection, specify `Attachments` in
     * the `include` parameter when retrieving data.
     *
     * To create an attachment, use the [Upload Attachment](https://developer.lockstep.io/reference/post_api-v1-attachments)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for attachments
     */
    public void setAttachments(@Nullable AttachmentModel[] value) { this.attachments = value; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     *
     * @return The field company
     */
    public @Nullable CompanyModel getCompany() { return this.company; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     *
     * @param value The new value for company
     */
    public void setCompany(@Nullable CompanyModel value) { this.company = value; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @return The field customer
     */
    public @Nullable CompanyModel getCustomer() { return this.customer; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @param value The new value for customer
     */
    public void setCustomer(@Nullable CompanyModel value) { this.customer = value; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @return The field customerPrimaryContact
     */
    public @Nullable ContactModel getCustomerPrimaryContact() { return this.customerPrimaryContact; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @param value The new value for customerPrimaryContact
     */
    public void setCustomerPrimaryContact(@Nullable ContactModel value) { this.customerPrimaryContact = value; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     *
     * @return The field creditMemos
     */
    public @Nullable CreditMemoInvoiceModel[] getCreditMemos() { return this.creditMemos; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     *
     * @param value The new value for creditMemos
     */
    public void setCreditMemos(@Nullable CreditMemoInvoiceModel[] value) { this.creditMemos = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldValues
     */
    public @Nullable CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldValues` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(@Nullable CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @return The field customFieldDefinitions
     */
    public @Nullable CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * A collection of custom fields linked to this record.  To retrieve this collection, specify
     * `CustomFieldDefinitions` in the `include` parameter when retrieving data.
     *
     * To create a custom field, use the [Create Custom Field](https://developer.lockstep.io/reference/post_api-v1-customfieldvalues)
     * endpoint with the `TableKey` to `Invoice` and the `ObjectKey` set to the `InvoiceId` for this record.  For
     * more information on extensibility, see [linking extensible metadata to objects](https://developer.lockstep.io/docs/custom-fields#linking-metadata-to-an-object).
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(@Nullable CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
};
