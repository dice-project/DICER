/**
 *
 * $Id$
 */
package tosca.validation;


/**
 * A sample validator interface for {@link tosca.Configuration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConfigurationValidator {
    boolean validate();

    boolean validateProperty_name(String value);
    boolean validateValue(String value);
}
