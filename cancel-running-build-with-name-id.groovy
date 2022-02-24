Jenkins.instance
       .getItemByFullName("create-credentials")
       .getBuild("5")
       .doStop();
