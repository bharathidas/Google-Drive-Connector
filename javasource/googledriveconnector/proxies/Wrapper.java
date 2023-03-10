// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googledriveconnector.proxies;

public class Wrapper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject wrapperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleDriveConnector.Wrapper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		Wrapper_Parents("GoogleDriveConnector.Wrapper_Parents");

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

	public Wrapper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Wrapper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject wrapperMendixObject)
	{
		if (wrapperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, wrapperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.wrapperMendixObject = wrapperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Wrapper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static googledriveconnector.proxies.Wrapper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googledriveconnector.proxies.Wrapper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static googledriveconnector.proxies.Wrapper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googledriveconnector.proxies.Wrapper(context, mendixObject);
	}

	public static googledriveconnector.proxies.Wrapper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googledriveconnector.proxies.Wrapper.initialize(context, mendixObject);
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
	 * @return value of Value
	 */
	public final java.lang.String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.String getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Wrapper_Parents
	 */
	public final googledriveconnector.proxies.Parents getWrapper_Parents() throws com.mendix.core.CoreException
	{
		return getWrapper_Parents(getContext());
	}

	/**
	 * @param context
	 * @return value of Wrapper_Parents
	 * @throws com.mendix.core.CoreException
	 */
	public final googledriveconnector.proxies.Parents getWrapper_Parents(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		googledriveconnector.proxies.Parents result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Wrapper_Parents.toString());
		if (identifier != null) {
			result = googledriveconnector.proxies.Parents.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Wrapper_Parents
	 * @param wrapper_parents
	 */
	public final void setWrapper_Parents(googledriveconnector.proxies.Parents wrapper_parents)
	{
		setWrapper_Parents(getContext(), wrapper_parents);
	}

	/**
	 * Set value of Wrapper_Parents
	 * @param context
	 * @param wrapper_parents
	 */
	public final void setWrapper_Parents(com.mendix.systemwideinterfaces.core.IContext context, googledriveconnector.proxies.Parents wrapper_parents)
	{
		if (wrapper_parents == null) {
			getMendixObject().setValue(context, MemberNames.Wrapper_Parents.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Wrapper_Parents.toString(), wrapper_parents.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return wrapperMendixObject;
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
			final googledriveconnector.proxies.Wrapper that = (googledriveconnector.proxies.Wrapper) obj;
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
