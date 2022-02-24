import jenkins.model.Jenkins
Jenkins.instance.getItemByFullName("originalJobName").renameTo( "New Name")
