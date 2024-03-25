
def quietMode= false;

def logger (log, quietMode) {
    if (!quietMode) {
        println log;
    }
}

logger("[Running post-generation script]", quietMode);
logger (request, quietMode);

//request -> ArchetypeGenerationRequest

def myAppArtifactId = "${artifactId}";
def myAppVersion = "${version}";

logger("myAppVersion: "+myAppArtifactId+", myAppVersion: "+myAppVersion, quietMode);

def moduleDir = new File(request.getOutputDirectory()+"/"+request.getArtifactId());
logger (moduleDir, quietMode);
def appPropertiesFile = new File(moduleDir, "src/main/resources/application.properties");
def someMarker = 'SOME_PLACEHOLDER_MARKER_CAN_BE_REPLACED_USING_GROOVY';

def someMarkerReplcaementContent="""
#demo properties
mail.enabled=true
mail.id=abc@pqr.com
""";

def appPropertiesContent = appPropertiesFile.getText('UTF-8');
appPropertiesContent = appPropertiesContent.replace(someMarker, someMarkerReplcaementContent);
appPropertiesFile.newWriter().withWriter { w ->
    w << appPropertiesContent
}
logger ( "[Finished running post-generation script]", quietMode);