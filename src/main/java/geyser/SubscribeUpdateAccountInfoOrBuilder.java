// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

package geyser;

public interface SubscribeUpdateAccountInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeUpdateAccountInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes pubkey = 1;</code>
   * @return The pubkey.
   */
  com.google.protobuf.ByteString getPubkey();

  /**
   * <code>uint64 lamports = 2;</code>
   * @return The lamports.
   */
  long getLamports();

  /**
   * <code>bytes owner = 3;</code>
   * @return The owner.
   */
  com.google.protobuf.ByteString getOwner();

  /**
   * <code>bool executable = 4;</code>
   * @return The executable.
   */
  boolean getExecutable();

  /**
   * <code>uint64 rent_epoch = 5;</code>
   * @return The rentEpoch.
   */
  long getRentEpoch();

  /**
   * <code>bytes data = 6;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>uint64 write_version = 7;</code>
   * @return The writeVersion.
   */
  long getWriteVersion();

  /**
   * <code>optional bytes txn_signature = 8;</code>
   * @return Whether the txnSignature field is set.
   */
  boolean hasTxnSignature();
  /**
   * <code>optional bytes txn_signature = 8;</code>
   * @return The txnSignature.
   */
  com.google.protobuf.ByteString getTxnSignature();
}