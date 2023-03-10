// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googledriveconnector.proxies;

public class Parents
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject parentsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleDriveConnector.Parents";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Parents_GoogleDriveFile("GoogleDriveConnector.Parents_GoogleDriveFile");

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

	public Parents(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Parents(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject parentsMendixObject)
	{
		if (parentsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, parentsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.parentsMendixObject = parentsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Parents.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static googledriveconnector.proxies.Parents initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googledriveconnector.proxies.Parents.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static googledriveconnector.proxies.Parents initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googledriveconnector.proxies.Parents(context, mendixObject);
	}

	public static googledriveconnector.proxies.Parents load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googledriveconnector.proxies.Parents.initialize(context, mendixObject);
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
	 * @return value of Parents_GoogleDriveFile
	 */
	public final googledriveconnector.proxies.GoogleDriveFile getParents_GoogleDriveFile() throws com.mendix.core.CoreException
	{
		return getParents_GoogleDriveFile(getContext());
	}

	/**
	 * @param context
	 * @return value of Parents_GoogleDriveFile
	 * @throws com.mendix.core.CoreException
	 */
	public final googledriveconnector.proxies.GoogleDriveFile getParents_GoogleDriveFile(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		googledriveconnector.proxies.GoogleDriveFile result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Parents_GoogleDriveFile.toString());
		if (identifier != null) {
			result = googledriveconnector.proxies.GoogleDriveFile.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Parents_GoogleDriveFile
	 * @param parents_googledrivefile
	 */
	public final void setParents_GoogleDriveFile(googledriveconnector.proxies.GoogleDriveFile parents_googledrivefile)
	{
		setParents_GoogleDriveFile(getContext(), parents_googledrivefile);
	}

	/**
	 * Set value of Parents_GoogleDriveFile
	 * @param context
	 * @param parents_googledrivefile
	 */
	public final void setParents_GoogleDriveFile(com.mendix.systemwideinterfaces.core.IContext context, googledriveconnector.proxies.GoogleDriveFile parents_googledrivefile)
	{
		if (parents_googledrivefile == null) {
			getMendixObject().setValue(context, MemberNames.Parents_GoogleDriveFile.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Parents_GoogleDriveFile.toString(), parents_googledrivefile.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return parentsMendixObject;
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
			final googledriveconnector.proxies.Parents that = (googledriveconnector.proxies.Parents) obj;
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
