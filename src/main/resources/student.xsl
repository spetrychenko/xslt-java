<xsl:stylesheet
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        version="2.0"
        xmlns:student="java:ua.javatar.StudentUtil"
        exclude-result-prefixes="student">

    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="Journal">
        <list>
            <xsl:for-each select="Student">
                <student>
                    <xsl:value-of select="student:adjustName(FirstName)"/>
                    <xsl:text>&#160;</xsl:text>
                    <xsl:value-of select="student:adjustName(LastName)"/>
                </student>
            </xsl:for-each>
        </list>
    </xsl:template>


</xsl:stylesheet>