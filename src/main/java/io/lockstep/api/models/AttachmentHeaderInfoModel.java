
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
public class AttachmentHeaderInfoModel
{
    private String groupKey;
    private String companyId;
    private Integer totalAttachments;
    private Integer totalArchived;
    private Integer totalActive;

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
     * The CompanyId associated with the attachment status report. Providing a null value will
     * return an attachment summary for all attachments associated to the provided GroupKey
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The CompanyId associated with the attachment status report. Providing a null value will
     * return an attachment summary for all attachments associated to the provided GroupKey
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The total number of attachments associated with the provided GroupKey and CompanyId.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalAttachments() { return this.totalAttachments; }
    /**
     * The total number of attachments associated with the provided GroupKey and CompanyId.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalAttachments(Integer value) { this.totalAttachments = value; }
    /**
     * The total number of archived attachments associated with the provided GroupKey and CompanyId.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalArchived() { return this.totalArchived; }
    /**
     * The total number of archived attachments associated with the provided GroupKey and CompanyId.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalArchived(Integer value) { this.totalArchived = value; }
    /**
     * The total number of active attachments associated with the provided GroupKey and CompanyId.
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getTotalActive() { return this.totalActive; }
    /**
     * The total number of active attachments associated with the provided GroupKey and CompanyId.
     *
     * @param value a {@link java.lang.Integer} object.
     */
    public void setTotalActive(Integer value) { this.totalActive = value; }
};
