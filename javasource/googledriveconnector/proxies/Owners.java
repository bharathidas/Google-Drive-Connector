// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googledriveconnector.proxies;

public class Owners
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject ownersMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleDriveConnector.Owners";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Owners_GoogleDriveFile("GoogleDriveConnector.Owners_GoogleDriveFile");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Owners(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Owners(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject ownersMendixObject)
	{
		if (ownersMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, ownersMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.ownersMendixObject = ownersMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Owners.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static googledriveconnector.proxies.Owners initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googledriveconnector.proxies.Owners.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static googledriveconnector.proxies.Owners initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googledriveconnector.proxies.Owners(context, mendixObject);
	}

	public static googledriveconnector.proxies.Owners load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googledriveconnector.proxies.Owners.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Owners_GoogleDriveFile
	 */
	public final googledriveconnector.proxies.GoogleDriveFile getOwners_GoogleDriveFile() throws com.mendix.core.CoreException
	{
		return getOwners_GoogleDriveFile(getContext());
	}

	/**
	 * @param context
	 * @return value of Owners_GoogleDriveFile
	 * @throws com.mendix.core.CoreException
	 */
	public final googledriveconnector.proxies.GoogleDriveFile getOwners_GoogleDriveFile(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		googledriveconnector.proxies.GoogleDriveFile result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Owners_GoogleDriveFile.toString());
		if (identifier != null) {
			result = googledriveconnector.proxies.GoogleDriveFile.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Owners_GoogleDriveFile
	 * @param owners_googledrivefile
	 */
	public final void setOwners_GoogleDriveFile(googledriveconnector.proxies.GoogleDriveFile owners_googledrivefile)
	{
		setOwners_GoogleDriveFile(getContext(), owners_googledrivefile);
	}

	/**
	 * Set value of Owners_GoogleDriveFile
	 * @param context
	 * @param owners_googledrivefile
	 */
	public final void setOwners_GoogleDriveFile(com.mendix.systemwideinterfaces.core.IContext context, googledriveconnector.proxies.GoogleDriveFile owners_googledrivefile)
	{
		if (owners_googledrivefile == null) {
			getMendixObject().setValue(context, MemberNames.Owners_GoogleDriveFile.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Owners_GoogleDriveFile.toString(), owners_googledrivefile.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return ownersMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final googledriveconnector.proxies.Owners that = (googledriveconnector.proxies.Owners) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
