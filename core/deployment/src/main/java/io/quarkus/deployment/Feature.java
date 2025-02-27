package io.quarkus.deployment;

import io.quarkus.deployment.builditem.FeatureBuildItem;

/**
 * Represents a feature provided by a core extension.
 *
 * @see FeatureBuildItem
 */
public enum Feature {

    AGROAL,
    AMAZON_DYNAMODB,
    AMAZON_LAMBDA,
    AMAZON_IAM,
    AMAZON_S3,
    AMAZON_SNS,
    AMAZON_SQS,
    AMAZON_SES,
    AMAZON_KMS,
    AMAZON_SSM,
    APICURIO_REGISTRY_AVRO,
    ARTEMIS_CORE,
    ARTEMIS_JMS,
    CACHE,
    CDI,
    CONFIG_YAML,
    CONSUL_CONFIG,
    ELASTICSEARCH_REST_CLIENT_COMMON,
    ELASTICSEARCH_REST_CLIENT,
    ELASTICSEARCH_REST_HIGH_LEVEL_CLIENT,
    FLYWAY,
    GRPC_CLIENT,
    GRPC_SERVER,
    HIBERNATE_ORM,
    HIBERNATE_ENVERS,
    HIBERNATE_ORM_PANACHE,
    HIBERNATE_ORM_PANACHE_KOTLIN,
    HIBERNATE_ORM_REST_DATA_PANACHE,
    HIBERNATE_REACTIVE,
    HIBERNATE_REACTIVE_PANACHE,
    HIBERNATE_SEARCH_ELASTICSEARCH,
    HIBERNATE_VALIDATOR,
    INFINISPAN_CLIENT,
    INFINISPAN_EMBEDDED,
    JAEGER,
    JAXRS_CLIENT_REACTIVE,
    JDBC_DB2,
    JDBC_DERBY,
    JDBC_H2,
    JDBC_POSTGRESQL,
    JDBC_MARIADB,
    JDBC_MSSQL,
    JDBC_MYSQL,
    JDBC_ORACLE,
    JGIT,
    JSCH,
    KAFKA_CLIENT,
    KAFKA_STREAMS,
    KEYCLOAK_AUTHORIZATION,
    KOTLIN,
    KUBERNETES,
    KUBERNETES_CLIENT,
    LIQUIBASE,
    LOGGING_GELF,
    MAILER,
    MICROMETER,
    MONGODB_CLIENT,
    MONGODB_PANACHE,
    MONGODB_PANACHE_KOTLIN,
    MONGODB_REST_DATA_PANACHE,
    MUTINY,
    NARAYANA_JTA,
    NARAYANA_LRA,
    NARAYANA_STM,
    NEO4J,
    OIDC,
    OIDC_CLIENT,
    OIDC_CLIENT_FILTER,
    OIDC_CLIENT_REACTIVE_FILTER,
    OIDC_TOKEN_PROPAGATION,
    OPENSHIFT_CLIENT,
    OPENTELEMETRY,
    OPENTELEMETRY_JAEGER_EXPORTER,
    OPENTELEMETRY_OTLP_EXPORTER,
    PICOCLI,
    QUARTZ,
    QUTE,
    REACTIVE_PG_CLIENT,
    REACTIVE_MYSQL_CLIENT,
    REACTIVE_MSSQL_CLIENT,
    REACTIVE_DB2_CLIENT,
    REDIS_CLIENT,
    RESTEASY,
    RESTEASY_JACKSON,
    RESTEASY_JAXB,
    RESTEASY_JSONB,
    RESTEASY_MULTIPART,
    RESTEASY_MUTINY,
    RESTEASY_QUTE,
    RESTEASY_REACTIVE,
    RESTEASY_REACTIVE_QUTE,
    RESTEASY_REACTIVE_JSONB,
    RESTEASY_REACTIVE_JACKSON,
    RESTEASY_REACTIVE_LINKS,
    REST_CLIENT,
    REST_CLIENT_JACKSON,
    REST_CLIENT_JAXB,
    REST_CLIENT_JSONB,
    REST_CLIENT_MUTINY,
    REST_CLIENT_REACTIVE,
    REST_CLIENT_REACTIVE_JACKSON,
    SCALA,
    SCHEDULER,
    SECURITY,
    SECURITY_JDBC,
    SECURITY_LDAP,
    SECURITY_JPA,
    SECURITY_PROPERTIES_FILE,
    SECURITY_OAUTH2,
    SERVLET,
    SMALLRYE_CONTEXT_PROPAGATION,
    SMALLRYE_FAULT_TOLERANCE,
    SMALLRYE_HEALTH,
    SMALLRYE_JWT,
    SMALLRYE_METRICS,
    SMALLRYE_OPENAPI,
    SMALLRYE_OPENTRACING,
    SMALLRYE_REACTIVE_MESSAGING,
    SMALLRYE_REACTIVE_MESSAGING_KAFKA,
    SMALLRYE_REACTIVE_MESSAGING_AMQP,
    SMALLRYE_REACTIVE_MESSAGING_MQTT,
    SMALLRYE_REACTIVE_STREAMS_OPERATORS,
    SMALLRYE_REACTIVE_TYPE_CONVERTERS,
    SMALLRYE_GRAPHQL,
    SMALLRYE_GRAPHQL_CLIENT,
    SPRING_DI,
    SPRING_WEB,
    SPRING_DATA_JPA,
    SPRING_DATA_REST,
    SPRING_SECURITY,
    SPRING_BOOT_PROPERTIES,
    SPRING_CACHE,
    SPRING_CLOUD_CONFIG_CLIENT,
    SPRING_SCHEDULED,
    SWAGGER_UI,
    TIKA,
    WEBSOCKETS,
    WEBSOCKETS_CLIENT,
    VAULT,
    VERTX,
    VERTX_WEB,
    VERTX_GRAPHQL,
    WEBJARS_LOCATOR;

    public String getName() {
        return toString().toLowerCase().replace('_', '-');
    }

}
